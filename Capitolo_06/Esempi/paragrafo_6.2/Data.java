/// codice 6.3

public class Data {
    private int giorno;	
    private int mese;
    private int anno;

    public void setGiorno(int valore) { 	// metodo setter per la variabile giorno
        if (valore > 0 && valore <= 31) { 	// controllo del giorno (da modificare)
            giorno = valore;
        }
        else {
            System.out.println("Giorno non valido");
        }
    }

    public int getGiorno() { 			// metodo getter per la variabile giorno
        return giorno;
    }

    public void setMese(int valore) { 	        // metodo setter per la variabile mese
        if (valore > 0 && valore <= 12) { 	// controllo del mese (corretto)
            mese = valore;
        }
        else {
            System.out.println("Mese non valido");
        }
    }

    public int getMese() { 			// metodo getter per la variabile mese
        return mese;
    }

    public void setAnno(int valore) { 	// metodo setter per la variabile anno
        anno = valore;
    }

    public int getAnno() { 			// metodo getter per la variabile anno
        return anno;
    }
}
