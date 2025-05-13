// classe Jmmobiliare.java
package com.jmmobiliare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import com.jmmobiliare.archivio.ArchivioImmobili;
import com.jmmobiliare.dati.Appartamento;
import com.jmmobiliare.dati.Garage;
import com.jmmobiliare.dati.Immobile;
import com.jmmobiliare.dati.Palazzo;
import com.jmmobiliare.exception.ImmobileInvalidoException;

public class Jmmobiliare {
	// creiamo una lista di immobili
	private List<Immobile> immobili;

	public Jmmobiliare() {
        // carica gli immobili salvati su file
        this.immobili = ArchivioImmobili.caricaImmobili();
    }

    // metodo per inserire un nuovo immobile
    public void inserisciImmobile(Immobile immobile) throws ImmobileInvalidoException {
        if (immobile == null) {
            throw new ImmobileInvalidoException("Immobile non può essere null.");
        }
        // aggiunge l'immobile alla lista
        immobili.add(immobile);

        // salva l'immobile anche su file
        ArchivioImmobili.salvaImmobile(immobile);
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

	// a. ricerca(String chiave)
	public List<Immobile> ricerca(String chiave) {
	    return ricercaImmobili(chiave, null, null);
	}

	// b. ricerca(String chiave, Predicate<Immobile> filtro)
	public List<Immobile> ricerca(String chiave, Predicate<Immobile> filtro) {
	    return ricercaImmobili(chiave, filtro, null);
	}

	// c. ricerca(String chiave, Comparator<Immobile> ordinamento)
	public List<Immobile> ricerca(String chiave, Comparator<Immobile> ordinamento) {
	    return ricercaImmobili(chiave, null, ordinamento);
	}

	// d. ricerca(Predicate<Immobile> filtro, Comparator<Immobile> ordinamento)
	public List<Immobile> ricerca(Predicate<Immobile> filtro, Comparator<Immobile> ordinamento) {
	    return ricercaImmobili(null, filtro, ordinamento);
	}

	// e. ricerca(Predicate<Immobile> filtro)
	public List<Immobile> ricerca(Predicate<Immobile> filtro) {
	    return ricercaImmobili(null, filtro, null);
	}

	// f. ricerca(Comparator<Immobile> ordinamento)
	public List<Immobile> ricerca(Comparator<Immobile> ordinamento) {
	    return ricercaImmobili(null, null, ordinamento);
	}

}