package com.jtombola;

import java.util.ArrayList;
import java.util.Random;

public class Bussolotto {
    private ArrayList<Integer> numeri;
    private Random random;

    // Costruttore
    public Bussolotto() {
        random = new Random();
        numeri = new ArrayList<>(90);
        for (int i = 1; i <= 90; i++) {
            numeri.add(i);
        }
    }

    // Metodo che estrae un numero casuale
    public int estraiNumero() {
        if (numeri.isEmpty()) {
            throw new IllegalStateException("Tutti i numeri sono stati estratti.");
        }
        int numeroCasuale = random.nextInt(numeri.size());
        int numeroEstratto = numeri.get(numeroCasuale);
        numeri.remove(numeroCasuale);
        return numeroEstratto;
    }

    // Metodo che restituisce il numero di numeri rimasti
    public int numeriRimasti() {
        return numeri.size();
    }
}