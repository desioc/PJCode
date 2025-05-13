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
        // restituisce tutte le partite in cui ha vinto la squadra1
    public List<Partita> getVittorieSquadra1() {
        return partiteCompletate.entrySet().stream()
            .filter(e -> e.getValue() == Risultato.SQUADRA1)
            .map(Map.Entry::getKey)
            .toList();
    }

    // restituisce la percentuale di pareggi
    public double percentualePareggi() {
        long totale = partiteCompletate.size();
        if (totale == 0) return 0;

        long pareggi = partiteCompletate.values().stream()
            .filter(r -> r == Risultato.PAREGGIO)
            .count();

        return (double) pareggi / totale * 100;
    }

    public List<Partita> getVittorieSquadra2() {
        return partiteCompletate.entrySet().stream()
            .filter(e -> e.getValue() == Risultato.SQUADRA2)
            .map(Map.Entry::getKey)
            .toList();
    }

    // restituisce tutte le partite in cui è stato registrato un risultato
    public List<Partita> getPartiteGiocate() {
        return partite.stream()
            .filter(partiteCompletate::containsKey)
            .toList();
    }
}