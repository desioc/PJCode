// classe sigillata Immobile che rappresenta un immobile
package com.jmmobiliare.dati;

public sealed abstract class Immobile implements Misurabile, Vendibile
        permits Appartamento, Garage, Palazzo {

    private double prezzo;

    public Immobile(double prezzo) {
        this.setPrezzo(prezzo);
    }

    public double getPrezzo() {
        return prezzo;
    }

    public final void setPrezzo(double prezzo) {
        if (prezzo < 0) {
            throw new IllegalArgumentException("Il prezzo deve essere positivo.");
        }
        this.prezzo = prezzo;
    }

    public abstract String getIndirizzo();
}