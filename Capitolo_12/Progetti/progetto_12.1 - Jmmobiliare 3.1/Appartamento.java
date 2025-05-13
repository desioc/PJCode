// classe Appartamento che implementa Immobile
package com.jmmobiliare.dati;

public final class Appartamento extends Immobile {
    private int metriQuadri;
    private int piano;
    private String indirizzo;

    public Appartamento(int metriQuadri, String indirizzo, int piano, double prezzo) {
        this.metriQuadri = metriQuadri;
        this.piano = piano;
        this.indirizzo = indirizzo;
        super(prezzo);
    }

    @Override
    public int getMetriQuadri() {
        return metriQuadri;
    }
    
    public int getPiano() {
        return piano;
    }
    
    @Override
    public String getIndirizzo() {
        return indirizzo;
    }

    @Override
    public String toString() {
        return """
           Appartamento {
               metri quadri = %d
               piano = %d
               indirizzo = %s
               prezzo = %s
           }
           """.formatted(piano, metriQuadri, indirizzo, getPrezzo());
    }

}