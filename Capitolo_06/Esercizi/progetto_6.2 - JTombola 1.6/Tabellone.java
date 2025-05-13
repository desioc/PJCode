package com.jtombola;

import java.util.HashSet;
import java.util.Set;

public class Tabellone {
    private static Tabellone istanza;
    private Set<Integer> numeriSelezionati;

    // Costruttore privato per il Singleton
    private Tabellone() {
        numeriSelezionati = new HashSet<>();
    }

    // Metodo statico per ottenere l'istanza Singleton
    public static Tabellone getInstance() {
        if (istanza == null) {
            istanza = new Tabellone();
        }
        return istanza;
    }

    // Metodo per selezionare un numero
    public void selezionaNumero(int numero) {
        if (numero < 1 || numero > 90) {
            throw new IllegalArgumentException("Numero non valido.");
        }
        if (numeriSelezionati.contains(numero)) {
            System.out.println("Numero " + numero + " è già stato selezionato.");
        } else {
            numeriSelezionati.add(numero);
            System.out.println("Numero " + numero + " selezionato sul tabellone.");
        }
    }

    // Metodo per visualizzare i numeri selezionati finora
    public void mostraNumeriSelezionati() {
        System.out.println("Numeri selezionati finora: " + numeriSelezionati);
    }
}