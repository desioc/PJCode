// classe Amministratore.java
package com.jlogin.dati;

public class Amministratore extends Utente {
    private String pin;

    public Amministratore (String username, String password, String pin) {
        super(username, password);
        setPin(pin);
    }

    public void setPin(String pin) {
        controllaPin(pin); // creiamo un metodo privato a parte per i controlli
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }
    
    private void controllaPin(String pin) {
        if (pin.length() != 4) {
            throw new IllegalArgumentException("Il pin deve essere composto da 4 cifre");
        }
    }

    public String toString() {
        return "Amministratore: " + super.toString();
    }
}