// classe MultiploDi7Exception
package com.eccezioni;

public class MultiploDi7Exception extends Exception {

    private final int numero;

    public MultiploDi7Exception(int numero) {
        super("Errore: il numero " + numero + " è un multiplo di 7.");
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "MultiploDi7Exception{" +
               "numero=" + numero +
               ", messaggio='" + getMessage() + '\'' +
               '}';
    }
}
