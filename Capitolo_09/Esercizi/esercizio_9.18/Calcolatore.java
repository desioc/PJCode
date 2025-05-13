// classe Calcolatore
package com.eccezioni;

public class Calcolatore {

    public static double dividi(int dividendo, int divisore) throws MultiploDi7Exception {
        if (divisore == 0) {
            throw new ArithmeticException("Divisione per zero non consentita.");
        }
        if (divisore % 7 == 0) {
            throw new MultiploDi7Exception(divisore);
        }
        return (double) dividendo / divisore;
    }
}
