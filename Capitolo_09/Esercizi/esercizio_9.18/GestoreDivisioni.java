// classe GestoreDivisioni
package com.eccezioni;

public class GestoreDivisioni {

    public static void gestisciDivisione(int dividendo, int divisore) {
        try {
            double risultato = Calcolatore.dividi(dividendo, divisore);
            System.out.println("Risultato della divisione: " + risultato);
        } catch (MultiploDi7Exception e) {
            System.out.println("Errore: divisore non valido. " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
