// classe Jmmobiliare.java
package com.jmmobiliare;

import com.jmmobiliare.dati.*;

public class Jmmobiliare {
    public void inserisciImmobile(Immobile immobile) throws ImmobileInvalidoException {
        if (immobile == null) {
            throw new ImmobileInvalidoException("Immobile non può essere null.");
        }
        System.out.println(immobile);
    }
}