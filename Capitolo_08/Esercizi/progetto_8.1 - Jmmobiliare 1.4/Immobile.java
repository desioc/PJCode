// classe sigillata Immobile che rappresenta un immobile
package com.jmmobiliare.dati;

public sealed abstract class Immobile implements Misurabile
    permits Appartamento, Garage, Palazzo {

    public abstract String getIndirizzo();
}
