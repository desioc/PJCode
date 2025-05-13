package com.jtombola;

public class Bussolotto {

    private final Estrazione estrazione;

    public Bussolotto() {
        this.estrazione = new EstrazioneCasuale(); // default
    }

    public Bussolotto(Estrazione estrazione) {
        this.estrazione = estrazione;
    }

    public int estraiNumero() {
        return estrazione.estrai();
    }

    public int numeriRimasti() {
        if (estrazione instanceof EstrazioneCasuale e) {
            return e.numeriRimasti();
        } else {
            return -1; // oppure lancia eccezione se altri tipi
        }
    }
}
