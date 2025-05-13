package com.jmenu.piatti;

public class SecondoPersonalizzato extends Secondo {
    public static final double SOVRAPPREZZO_SECONDO = 5;

    public SecondoPersonalizzato(int codice, String nome, double prezzo) {
        super(codice, nome, prezzo);
    }
    
    @Override
    public double calcolaPrezzo() {
        return super.calcolaPrezzo() + SOVRAPPREZZO_SECONDO; // maggiorazione con sovrapprezzo
    }
}