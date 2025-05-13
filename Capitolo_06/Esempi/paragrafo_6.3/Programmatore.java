package com.cdsc.sottoclassi;           // dichiarazione di appartenenza a package diverso
import com.cdsc.superclassi.Dipendente; // import della superclasse

public class Programmatore extends Dipendente { 	// eredita i 4 metodi pubblici
    private String[] certificazioni;			// variabile d’istanza privata
 
    public Programmatore(int matricola, int annoDiAssunzione) { // costruttore
        setMatricola(matricola);			// uso di un metodo ereditato
        setAnnoDiAssunzione(annoDiAssunzione);	        // uso di un metodo ereditato
//        this.matricola = matricola;			// uso di variabile ereditata
//        this.annoDiAssunzione = annoDiAssunzione;	// uso di variabile ereditata
    }
    public void setCertificazioni(String[] certificazioni) {  	// metodo setter
        this.certificazioni = certificazioni;
    }
    public String[] getCertificazioni() {		// metodo getter
        return certificazioni;
    }
}
