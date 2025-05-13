package com.cdsc.superclassi;                               // dichiarazione di appartenenza al package
public class Dipendente {
    private int matricola;			            // variabile d段stanza privata
    private int annoDiAssunzione;		            // variabile d段stanza privata
//    protected int matricola;				// variabile d段stanza protetta
//    protected int annoDiAssunzione;			// variabile d段stanza protetta


    public void setMatricola(int matricola) {	            // metodo setter
        this.matricola = matricola;
    }
    public int getMatricola() { 		            // metodo getter
        return matricola;
    }
    public void setAnnoDiAssunzione(int annoDiAssunzione) { // metodo setter
        this.annoDiAssunzione = annoDiAssunzione;
    }
    public int getAnnoDiAssunzione() {		            // metodo getter
        return annoDiAssunzione;
    }
}