// classe JLogin.java
package com.jlogin;

import com.jlogin.dati.*;
import java.util.*;

public class JLogin {

    public boolean loginAmministratore(String username, String password, String pin) {
        Amministratore admin = ricercaAmministratore(username);
        if (admin != null && admin.getPassword().equals(password) && admin.getPin().equals(pin)) {
            admin.setLoggato(true);
            return true;
        }
        return false;
    }

    public boolean loginUtenteStandard(String username, String password) {
        UtenteStandard user = ricercaUtenteStandard(username);
        if (user != null && user.getPassword().equals(password)) {
            user.setLoggato(true);
            return true;
        }
        return false;
    }

    public boolean logout(String username) {
        UtenteStandard utenteStandard = ricercaUtenteStandard(username);
        if (utenteStandard != null) {
            utenteStandard.setLoggato(false);
            return true;
        }
        Amministratore amministratore = ricercaAmministratore(username);
        if (amministratore != null) {
            amministratore.setLoggato(false);
            return true;
        }
        return false;
    }

    private Amministratore ricercaAmministratore(String username) {
        Utenti utenti = Utenti.getInstance();
        HashSet<Amministratore> amministratori = utenti.getAmministratori();
        for (Amministratore amministratore : amministratori) {
            if (amministratore.getUsername().equals(username)) {
                return amministratore;
            }
        }
        return null;
    }

    private UtenteStandard ricercaUtenteStandard(String username) {
        Utenti utenti = Utenti.getInstance();
        HashSet<UtenteStandard> utentiStandard = utenti.getUtentiStandard();
        for (UtenteStandard utenteStandard : utentiStandard) {
            if (utenteStandard.getUsername().equals(username)) {
                return utenteStandard;
            }
        }
        return null;
    }
}