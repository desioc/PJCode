public class InizializzatoreStatico {
    private static int a = 10;		                // variabile statica
    public InizializzatoreStatico() {	                // costruttore
        a += 10;				        // incremento di a di 10 unità
        System.out.println("Nel costruttore, a = " + a); // stampa del valore di a
    }
    static {				                // inizializzatore statico
        System.out.println("Nel blocco, a = " + a); 	// stampa del valore di a
    }					                // fine inizializzatore statico
}

