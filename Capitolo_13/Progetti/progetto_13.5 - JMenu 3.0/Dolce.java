package com.jmenu.piatti;

public class Dolce extends Piatto {
    public Dolce(int codice, String nome, double prezzo) {
        super(codice, nome, prezzo);
    }

    @Override
    public double calcolaPrezzo() {
        return getPrezzo(); // Nessuna modifica al prezzo base
    }
}
