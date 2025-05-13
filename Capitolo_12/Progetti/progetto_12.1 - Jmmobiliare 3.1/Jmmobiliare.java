// classe Jmmobiliare.java
package com.jmmobiliare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import com.jmmobiliare.dati.Appartamento;
import com.jmmobiliare.dati.Garage;
import com.jmmobiliare.dati.Immobile;
import com.jmmobiliare.dati.Palazzo;
import com.jmmobiliare.exception.ImmobileInvalidoException;

public class Jmmobiliare {
     // creiamo una lista di immobili
    private List<Immobile> immobili;

    public Jmmobiliare() {
        this.immobili = inizializzaImmobili();
    }

    // anche se non richiesto modifichiamo anche il metodo inserisci affinchè
    // aggiunga immobili alla lista
    public void inserisciImmobile(Immobile immobile) throws ImmobileInvalidoException {
        if (immobile == null) {
            throw new ImmobileInvalidoException("Immobile non può essere null.");
        }
         // modificato per aggiungere l'immobile alla lista
        immobili.add(immobile);
    }

    public List<Immobile> ricercaImmobili(String chiave, Predicate<Immobile> filtro, Comparator<Immobile> ordinatore) {
        String chiaveLower = (chiave == null) ? "" : chiave.toLowerCase();
        Predicate<Immobile> filtroEffettivo = (filtro != null) ? filtro : immobile -> true;
        Comparator<Immobile> ordinatoreEffettivo = (ordinatore != null) ? ordinatore : Comparator.comparing(Immobile::getPrezzo);

        return immobili.stream()
                .filter(immobile ->
                    (chiaveLower.isEmpty() || immobile.getIndirizzo().toLowerCase().contains(chiaveLower))
                    && filtroEffettivo.test(immobile))
                .sorted(ordinatoreEffettivo)
                .toList();
    }

     // metodo per inizializzare una lista di immobili
    private List<Immobile> inizializzaImmobili() {
        List<Immobile> lista = new ArrayList<>();

        lista.add(new Appartamento(80, "Via Roma 1" , 2, 200000));

        List<Appartamento> appartamenti = new ArrayList<>();
        appartamenti.add(new Appartamento(80, "Corso Italia 5" , 4, 350000)); // metri quadri, indirizzo, piano
        appartamenti.add(new Appartamento(100, "Corso Italia 5" , 3, 380000));
        appartamenti.add(new Appartamento(120, "Corso Italia 5" , 8, 430000));

        lista.add(new Palazzo(appartamenti));
        lista.add(new Garage(300, "Via Milano 10" , 2, 490000)); // metri quadri, indirizzo, posti auto

        return lista;
    }

     // a. ricerca(String chiave)
    public List<Immobile> ricerca(String chiave) {
        return ricercaImmobili(chiave, null, null);
    }

     // b. ricerca(String chiave, Predicate<Immobile> filtro)
    public List<Immobile> ricerca(String chiave, Predicate<Immobile> filtro) {
        return ricerca(chiave, filtro, null);
    }

     // c. ricerca(String chiave, Comparator<Immobile> ordinamento)
    public List<Immobile> ricerca(String chiave, Comparator<Immobile> ordinamento) {
        return ricerca(chiave, null, ordinamento);
    }

     // d. ricerca(Predicate<Immobile> filtro, Comparator<Immobile> ordinamento)
    public List<Immobile> ricerca(Predicate<Immobile> filtro, Comparator<Immobile> ordinamento) {
        return ricercaImmobili(null, filtro, ordinamento);
    }

     // e. ricerca(Predicate<Immobile> filtro)
    public List<Immobile> ricerca(Predicate<Immobile> filtro) {
        return ricerca(null, filtro, null);
    }

     // f. ricerca(Comparator<Immobile> ordinamento)
    public List<Immobile> ricerca(Comparator<Immobile> ordinamento) {
        return ricerca(null, null, ordinamento);
    }
}