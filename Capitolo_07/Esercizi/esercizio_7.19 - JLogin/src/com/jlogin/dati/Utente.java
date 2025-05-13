package com.jlogin.dati;

public abstract class Utente {
    private String username;
    private String password;
    private boolean loggato;
    
    public Utente (String username, String password){
        if (username == null || password == null || username.equals("") || password.equals("")) {
            throw new IllegalArgumentException("Username e password non possono essere nulle");
        }
        this.username = username;
        this.setPassword(password);
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setLoggato(boolean loggato) {
        this.loggato = loggato;
    }

    public boolean getLoggato() {
        return loggato;
    }
    
    public String toString() {
        return username + " [" + loggato + "]";
    }
}