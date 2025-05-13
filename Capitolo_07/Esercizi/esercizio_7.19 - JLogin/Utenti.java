// classe Utenti.java
package com.jlogin.dati;
import java.util.HashSet;

public class Utenti {
    private HashSet<UtenteStandard> utentiStandard;
    private HashSet<Amministratore> amministratori;
    private static Utenti instance;

    private Utenti () {
        utentiStandard = new HashSet<>();
        amministratori = new HashSet<>();
        caricaDati();
    }

    public static Utenti getInstance(){
        if (instance == null) {
            instance = new Utenti();
        }
        return instance;
    }

    public HashSet<UtenteStandard> getUtentiStandard() {
        return utentiStandard;
    }

    public HashSet<Amministratore> getAmministratori() {
        return amministratori;
    }

    private void caricaDati() {
        amministratori.add(new Amministratore("c.monet", "password", "1234"));
        utentiStandard.add(new UtenteStandard("v.vangogh", "password"));
    }
}