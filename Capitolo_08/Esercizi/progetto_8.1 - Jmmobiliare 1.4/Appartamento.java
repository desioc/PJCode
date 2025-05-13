// classe Appartamento che implementa Immobile
package com.jmmobiliare.dati;
import java.util.List;

public final class Appartamento extends Immobile {
    private int metriQuadri;
    private int piano;
    private String indirizzo;

    public Appartamento(int metriQuadri, String indirizzo, int piano) {
        this.metriQuadri = metriQuadri;
        this.piano = piano;
        this.indirizzo = indirizzo;
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
           }
           """.formatted(piano, metriQuadri, indirizzo);
    }

}