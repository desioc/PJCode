// classe di test aggiornata per il progetto 11.2
package com.jgarage.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.function.Predicate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jgarage.business.Garage;
import com.jgarage.exception.PostoNonDisponibileException;
import com.jgarage.model.Auto;
import com.jgarage.model.Dimensione;
import com.jgarage.model.Moto;
import com.jgarage.model.Motorizzato;

public class TestGarage {

    private Garage garage;

    @BeforeEach
    public void setUp() {
        garage = new Garage();
        garage.permettiAccesso(new Auto("AB123CD" , Dimensione.GRANDE));
        garage.permettiAccesso(new Moto("XY987ZT" , true));
        garage.permettiAccesso(new Auto("EF456GH" , Dimensione.MEDIA));
        garage.permettiAccesso(new Moto("LM654OP" , false));
    }

    @Test
    public void testPermettiAccessoSuccesso() {
        garage.permettiAccesso(new Auto("JK321UV" , Dimensione.MEDIA));
        assertEquals(5, garage.numeroVeicoliParcheggiati());
    }

    @Test
    public void testPermettiAccessoPostiEsauriti() {
        garage.permettiAccesso(new Auto("AA111AA" , Dimensione.GRANDE));

        assertThrows(PostoNonDisponibileException.class, () -> {
            garage.permettiAccesso(new Auto("CC333CC" , Dimensione.GRANDE));
        } );
    }


    @Test
    public void testRicercaPerTarga() {
        Predicate<Motorizzato> filtro = v -> v.targa().startsWith("AB");
        List<Motorizzato> risultati = garage.ricerca(filtro);
        assertEquals(1, risultati.size());
        assertEquals("AB123CD" , risultati.get(0).targa());
    }

    @Test
    public void testRicercaPerAutoGrandi() {
        Predicate<Motorizzato> filtro = v -> v instanceof Auto auto && auto.dimensione() == Dimensione.GRANDE;
        List<Motorizzato> risultati = garage.ricerca(filtro);
        assertEquals(1, risultati.size());
        assertEquals("AB123CD" , risultati.get(0).targa());
    }

    @Test
    public void testRicercaPerMotoConAccessori() {
        Predicate<Motorizzato> filtro = v -> v instanceof Moto moto && moto.accessori();
        List<Motorizzato> risultati = garage.ricerca(filtro);
        assertEquals(1, risultati.size());
        assertEquals("XY987ZT" , risultati.get(0).targa());
    }

    @Test
    public void testRicercaPerMotoSenzaAccessori() {
        Predicate<Motorizzato> filtro = v -> v instanceof Moto moto && !moto.accessori();
        List<Motorizzato> risultati = garage.ricerca(filtro);
        assertEquals(1, risultati.size());
        assertEquals("LM654OP" , risultati.get(0).targa());
    }

    @Test
    public void testRicercaNessunRisultato() {
        Predicate<Motorizzato> filtro = v -> v.targa().equals("NONESISTE");
        List<Motorizzato> risultati = garage.ricerca(filtro);
        assertTrue(risultati.isEmpty());
    }
}