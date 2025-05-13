// classe Campionato.java
package com.jbet.business;

import com.jbet.model.*;
import java.util.*;

public class Campionato {
    private final List<Partita> partite = new ArrayList<>();
    private final Map<Partita, Risultato> partiteCompletate = new HashMap<>();

    public List<Partita> getPartite() {
        return partite;
    }

    public Map<Partita, Risultato> getPartiteCompletate() {
        return partiteCompletate;
    }

    public void aggiungiPartita(Partita partita) {
        partite.add(partita);
    }
}
