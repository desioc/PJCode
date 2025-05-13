// classe Garage che implementa Immobile
package com.jmmobiliare.dati;

public final class Garage extends Immobile {
    private int metriQuadri;
    private String indirizzo;
    private int postiAuto;

    public Garage(int metriQuadri, String indirizzo, int postiAuto, double prezzo) {
        this.metriQuadri = metriQuadri;
        this.indirizzo = indirizzo;
        this.postiAuto = postiAuto;
        super(prezzo);
    }

    @Override
    public int getMetriQuadri() {
        return metriQuadri;
    }
    
    @Override
    public String getIndirizzo() {
        return indirizzo;
    }
    
    public int getPostiAuto() {
        return postiAuto;
    }
    
    @Override
    public String toString() {
        return """
           Garage {
               indirizzo = '%s',
               metri quadri = %d
               posti auto = %d
               prezzo = %.2f
           }
           """.formatted(indirizzo, metriQuadri, getPostiAuto(), getPrezzo());
    }
}