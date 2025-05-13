package com.jlogin.dati;

public class UtenteStandard extends Utente {
    public UtenteStandard (String username,String password) {
        super(username, password);
    }
    
    public String toString() {
        return "Utente standard: " + super.toString();
    }
}