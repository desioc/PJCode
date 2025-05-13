record Rettangolo(int base, int altezza) {
    // costruttore canonico non compatto
    /* public Rettangolo(int base, int altezza) {
        if (base <= 0 || altezza <= 0) {
            throw new IllegalArgumentException("Rettangolo non valido"); // lancio eccezione
        } 
        this.base = larghezza;                    // controllo di consistenza: bisogna settare 
        this.altezza = altezza;                   // tutte gli attributi in ogni caso 
    }*/
    public Rettangolo { 
        base = Math.abs(base); // stiamo modificando i parametri del metodo prima 
        altezza = Math.abs(altezza);     // che vengano settati implicitamente
    }

    // costruttore canonico compatto
    /* public Rettangolo {
        if (base <= 0 || altezza <= 0) {
            throw new IllegalArgumentException("Rettangolo non valido");
        } 
    } */
    // costruttore non canonico
    public Rettangolo(int base, int altezza, boolean eccezione) {
        if (base <= 0 || altezza <= 0) {  	// controllo di consistenza
            if (eccezione) { 			// se eccezione vale true, lanciamo l'eccezione
                throw new IllegalArgumentException("Rettangolo non valido");
            } else {         			// se eccezione vale false, stampiamo un messaggio
                System.out.println("Messaggio: dati del rettangolo non validi!");
            }
        }         
     // this.base = base;       // non compila (solo il costruttore canonico setta gli attributi)
     // this.altezza = altezza; // non compila (solo il costruttore canonico setta gli attributi)
        this(base, altezza); 			// chiamata al costruttore canonico
    }
}