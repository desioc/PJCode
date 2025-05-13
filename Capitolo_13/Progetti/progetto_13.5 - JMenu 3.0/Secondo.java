package com.jmenu.piatti;

public class Secondo extends Piatto {
    public Secondo(int codice, String nome, double prezzo) {
        super(codice, nome, prezzo);
    }

    @Override
    public double calcolaPrezzo() {
        return getPrezzo() * 1.15; // Maggiorazione del 15%
    }
}
