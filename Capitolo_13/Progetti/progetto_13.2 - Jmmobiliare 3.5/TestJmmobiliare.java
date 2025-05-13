package com.jmmobiliare.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jmmobiliare.Jmmobiliare;
import com.jmmobiliare.Ordinatori;
import com.jmmobiliare.dati.Appartamento;
import com.jmmobiliare.dati.Garage;
import com.jmmobiliare.dati.Immobile;
import com.jmmobiliare.dati.Vendibile;

public class TestJmmobiliare {

    private Jmmobiliare j;

    @BeforeEach
    public void setup() {
	    // cancella tutti i file nella cartella immobili (se esiste)
        Path dir = Paths.get("immobili");
        if (Files.exists(dir)) {
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
                for (Path file : stream) {
                    Files.deleteIfExists(file);
                }
            } catch (Exception e) {
                System.err.println("Errore durante la pulizia della cartella immobili: " + e.getMessage());
            }
        }

        j = new Jmmobiliare();

	    // inserisce dati di esempio coerenti con i test
        try {
            j.inserisciImmobile(new Garage(20, "Via Torino, Milano" , 1, 25000));
            j.inserisciImmobile(new Appartamento(120, "Via Roma, Firenze" , 2, 250000));
            j.inserisciImmobile(new Appartamento(85, "Corso Italia, Napoli" , 3, 180000));
        } catch (Exception e) {
            System.err.println("Errore nell'inserimento dati di test: " + e.getMessage());
        }
    }


    @Test
    public void testRicercaSoloChiave() {
        List<Immobile> risultati = j.ricerca("milano");
        assertEquals(1, risultati.size());
        assertTrue(risultati.get(0).getIndirizzo().toLowerCase().contains("milano"));
    }

    @Test
    public void testRicercaChiaveEFiltro() {
        Predicate<Immobile> soloGarage = i -> i instanceof Garage;
        List<Immobile> risultati = j.ricerca("milano" , soloGarage);
        assertEquals(1, risultati.size());
        assertTrue(risultati.get(0) instanceof Garage);
    }

    @Test
    public void testRicercaChiaveEOrdinamento() {
        Comparator<Immobile> ordinaPerMetri = Ordinatori.perMetriQuadriDiscendente();
        List<Immobile> risultati = j.ricerca("corso" , ordinaPerMetri);
        assertEquals(1, risultati.size());
        assertTrue(risultati.get(0).getIndirizzo().toLowerCase().contains("corso"));
    }

    @Test
    public void testRicercaFiltroEOrdinamento() {
        Predicate<Immobile> soloAppartamenti = i -> i instanceof Appartamento;
        Comparator<Immobile> ordinaPerPrezzo = Ordinatori.perPrezzoAscendente();
        List<Immobile> risultati = j.ricerca(soloAppartamenti, ordinaPerPrezzo);
        assertFalse(risultati.isEmpty());
        for (Immobile i : risultati) {
            assertTrue(i instanceof Appartamento);
        }
    }

    @Test
    public void testRicercaSoloFiltro() {
        Predicate<Immobile> grandiImmobili = i -> i.getMetriQuadri() > 100;
        List<Immobile> risultati = j.ricerca(grandiImmobili);
        for (Immobile i : risultati) {
            assertTrue(i.getMetriQuadri() > 100);
        }
    }

    @Test
    public void testRicercaSoloOrdinamento() {
        Comparator<Immobile> ordinaPerPrezzo = Ordinatori.perPrezzoAscendente();
        List<Immobile> risultati = j.ricerca(ordinaPerPrezzo);
        assertEquals(3, risultati.size());
        for (int i = 0; i < risultati.size() - 1; i++) {
            double p1 = ((Vendibile) risultati.get(i)).getPrezzo();
            double p2 = ((Vendibile) risultati.get(i + 1)).getPrezzo();
            assertTrue(p1 <= p2);
        }
    }
}