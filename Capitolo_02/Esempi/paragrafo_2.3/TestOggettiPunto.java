public class TestOggettiPunto { 		// dichiarazione della classe
    public static void main(String args[]) { 	// dichiarazione del metodo main
        Punto punto1;				// dichiarazione della variabile punto1 
        punto1 = new Punto();			// creazione dell'oggetto punto1
        punto1.x = 2;				// settaggio della variabile x di punto1
        punto1.y = 6;				// settaggio della variabile y di punto1
        Punto punto2 = new Punto(); 		// dichiarazione e istanza di punto2
        punto2.x = 0;				// settaggio della variabile x di punto2
        punto2.y = 1;        			// settaggio della variabile y di punto2
        System.out.println(punto1.x);		// stampa della variabile x di punto1
        System.out.println(punto1.y); 		// stampa della variabile y di punto1
        System.out.println(punto2.x); 		// stampa della variabile x di punto2
        System.out.println(punto2.y); 		// stampa della variabile y di punto2
   }						// chiusura del metodo main
}						// chiusura della classe