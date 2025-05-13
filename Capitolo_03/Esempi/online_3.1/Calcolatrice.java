/**
 * Gestisce operazioni matematiche di base.
 *
 * @author Claudio
 * @version 1.0
 */
public class Calcolatrice {

    /**
     * Divide due numeri.
     * Questo metodo è simile a {@link #dividi(double, double)} ma gestisce i 
     * valori null.
     * 
     * @param numeratore il numero da dividere
     * @param denominatore il numero per cui dividere
     * @return il risultato della divisione
     * @throws ArithmeticException se il denominatore è zero
     */
    public double dividi(Double numeratore, Double denominatore) {
        if (denominatore == null || denominatore == 0) {
            throw new ArithmeticException("Divisione non consentita!");
        }
        return numeratore / denominatore;
    }
    
    /**
     * Divide due numeri.
     * Questo metodo è simile a {@link #dividi(Double, Double)} ma con 
     * valori primitivi.
     * 
     * @param numeratore il numero da dividere
     * @param denominatore il numero per cui dividere
     * @return il risultato della divisione
     * @throws ArithmeticException se il denominatore è zero
     */
    public double dividi(double numeratore, double denominatore) {
        if (denominatore == 0) {
            throw new ArithmeticException("Divisione non consentita!");
        }
        return numeratore / denominatore;
    }
}
