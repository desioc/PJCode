// interfaccia sigillata Immobile che rappresenta un immobile
package com.jmmobiliare.dati;
import java.util.List;

public sealed interface Immobile permits Appartamento, Garage, Palazzo {
    int getMetriQuadri();
    String getIndirizzo();
}