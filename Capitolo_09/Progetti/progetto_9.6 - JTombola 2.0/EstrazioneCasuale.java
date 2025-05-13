// classe EstrazioneCasuale
package com.jtombola;

import java.util.Random;

public class EstrazioneCasuale implements Estrazione {

    private final Random random = new Random();
    private final boolean[] numeriEstratti = new boolean[90];
    private int estratti = 0;

    @Override
    public int estrai() {
        if (estratti >= 90) {
            throw new IllegalStateException("Tutti i numeri sono stati estratti.");
        }

        int numero;
        do {
            numero = random.nextInt(90) + 1;
        } while (numeriEstratti[numero - 1]);

        numeriEstratti[numero - 1] = true;
        estratti++;
        return numero;
    }

    public int numeriRimasti() {
        return 90 - estratti;
    }
}
