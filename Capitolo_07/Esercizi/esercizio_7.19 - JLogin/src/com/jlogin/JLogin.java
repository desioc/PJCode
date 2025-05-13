package com.jlogin;
import com.jlogin.dati.*;

public class JLogin {
    public boolean loginAmministratore(String username, String password, String pin) {

    }
    /// Ciao
    public boolean loginUtenteStandard(String username, String password) {

    }

    public boolean logout(String username) {
        UtenteStandard utenteStandard = ricercaUtenteStandard(username);
        if (utenteStandard != null) {
            utenteStandard.setLoggato(false);
            return true;
        }
        Amministratore amministratore = ricercaUtenteStandard(username);
        if (amministratore != null) {
            amministratore.setLoggato(false);
            return true;
        }
        return false;
    }

    private Amministratore ricercaAmministratore(String username) {
        Utenti utenti = Utenti.getInstance();
        ArrayList<Amministratore> amministratori = utenti.getAmministratori();
        for (Amministratore amministratore : amministratori) {
            if (amministratore.getUsername().equals(username)) {
                return amministratore;
            }
        }
        return null;
    }
    
    private UtenteStandard ricercaUtenteStandard(String username) {
        Utenti utenti = Utenti.getInstance();
        ArrayList<UtenteStandard> utentiStandard = utenti.getUtentiStandard();
        for (UtenteStandard utenteStandard : utentiStandard) {
            if (utenteStandard.getUsername().equals(username)) {
             return utenteStandard;
            }
        }
        return null;
    }
}