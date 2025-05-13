// classe sigillata Immobile che rappresenta un immobile
package com.jmmobiliare.dati;

import java.io.Serializable;

public sealed abstract class Immobile implements Misurabile, Vendibile, Serializable permits Appartamento, Garage, Palazzo {

    private static final long serialVersionUID = 580303159575953289L;
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