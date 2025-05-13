package com.jmenu.piatti;

public class Antipasto extends Piatto {
    public Antipasto(int codice, String nome, double prezzo) {
        super(codice, nome, prezzo);
    }

    @Override
    public double calcolaPrezzo() {
        return getPrezzo() * 0.9; // Sconto del 10%
    }
}
