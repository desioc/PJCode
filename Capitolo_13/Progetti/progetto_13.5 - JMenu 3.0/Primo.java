package com.jmenu.piatti;

public class Primo extends Piatto {
    public Primo(int codice, String nome, double prezzo) {
        super(codice, nome, prezzo);
    }

    @Override
    public double calcolaPrezzo() {
        return getPrezzo(); // nessuna modifica al prezzo base
    }
}