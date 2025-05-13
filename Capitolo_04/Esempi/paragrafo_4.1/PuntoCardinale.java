public enum PuntoCardinale {
    NORD, EST, SUD, OVEST;	// le uniche istanze dell'enumerazione
}
/* 
classe (quasi) equivalente

public class PuntoCardinale {
    // Istanze costanti statiche e pubbliche di PuntoCardinale
    public static final PuntoCardinale NORD = new PuntoCardinale();
    public static final PuntoCardinale EST = new PuntoCardinale();
    public static final PuntoCardinale SUD = new PuntoCardinale();
    public static final PuntoCardinale OVEST = new PuntoCardinale();
    private final String nome;
    // Costruttore privato che impedisce di creare altri oggetti
    private PuntoCardinale() {
    }
}
*/


/* public class PuntoCardinale {
    private String nome;	      // variabile d'istanza privata (non accessibile all'esterno)
    public PuntoCardinale(String n) { // costruttore della classe
        nome = n;
    }
} */