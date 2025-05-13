// classe Garage che implementa Immobile
package com.jmmobiliare.dati;

public final class Garage implements Immobile {
    private int metriQuadri;
    private String indirizzo;
    private int postiAuto;

    public Garage(int metriQuadri, String indirizzo, int postiAuto) {
        this.metriQuadri = metriQuadri;
        this.indirizzo = indirizzo;
        this.postiAuto = postiAuto;
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
           }
           """.formatted(indirizzo, metriQuadri, postiAuto);
    }
}