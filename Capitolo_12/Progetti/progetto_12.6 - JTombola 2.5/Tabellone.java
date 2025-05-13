package com.jtombola;

import java.util.HashSet;
import java.util.Set;

public class Tabellone {
    private static Tabellone istanza;
    private Set<Integer> numeriSelezionati;

    // costruttore privato per il Singleton
    private Tabellone() {
        numeriSelezionati = new HashSet<>();
    }

    // metodo statico per ottenere l'istanza Singleton
    public static Tabellone getInstance() {
        if (istanza == null) {
            istanza = new Tabellone();
        }
        return istanza;
    }

    // metodo per selezionare un numero
    public void selezionaNumero(int numero) {
        if (numero < 1 || numero > 90) {
            throw new IllegalArgumentException("Numero non valido.");
        }
        if (numeriSelezionati.contains(numero)) {
            System.out.println("Numero " + numero + " � gi� stato selezionato.");
        } else {
            numeriSelezionati.add(numero);
            System.out.println("Numero " + numero + " selezionato sul tabellone.");
        }
    }

    public boolean contiene(int numero) {
        return numeriSelezionati.contains(numero);
    }
    
    // metodo per visualizzare i numeri selezionati finora (ordinati)
    public void mostraNumeriSelezionati() {
        System.out.println("Numeri selezionati finora: " +
            numeriSelezionati.stream()
                             .sorted()
                             .map(String::valueOf)
                             .collect(java.util.stream.Collectors.joining(", "))
        );
    }
    
    // metodo per visualizzare i numeri selezionati raggruppati per decina
    public void mostraNumeriRaggruppatiPerDecina() {
        System.out.println("Numeri raggruppati per decina:");
        numeriSelezionati.stream()
            .collect(java.util.stream.Collectors.groupingBy(n -> 
                (n - 1) / 10 + 1))
            .forEach((decina, numeri) -> 
                System.out.println("Decina " + decina + ": " +
                    numeri.stream()
                          .sorted()
                          .map(String::valueOf)
                          .collect(java.util.stream.Collectors.joining(", "))));
    }


}