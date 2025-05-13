package com.eccezioni;

public class TestGestoreDivisioni {
    public static void main(String[] args) {
        GestoreDivisioni.gestisciDivisione(14, 2);  // Divisione valida
        GestoreDivisioni.gestisciDivisione(14, 7);  // Multiplo di 7
        GestoreDivisioni.gestisciDivisione(14, 0);  // Divisione per zero
    }
}
