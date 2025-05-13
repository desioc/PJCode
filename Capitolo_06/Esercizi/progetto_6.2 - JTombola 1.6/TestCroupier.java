package com.jtombola;

public class TestCroupier {
    public static void main(String[] args) {
        Croupier croupier = new Croupier();

        // Estrai 10 numeri come esempio
        for (int i = 0; i < 10; i++) {
            croupier.estraiNumero();
        }

        // Mostra i numeri rimasti nel bussolotto
        croupier.numeriRimasti();
    }
}