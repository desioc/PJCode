package com.jlogin.test;
import com.jlogin.*;
import com.jlogin.dati.*;
import static java.io.IO.*;

public class TestJLogin  {
    public static void main(String args[]) {
        String tipo = null;
        do {
            tipo = readln("Utente o Amministratore? ");
            println("\nTipo: " + tipo);
        } while(!(tipo.equals("Utente") || tipo.equals("Amministratore")));
        String username = readln("Inserire username ");
        String password = readln("Inserire password ");
        boolean loggato = false;
        if (tipo.equals("Amministratore")) {
            String pin = readln("Inserire pin ");
            loggato = JLogin.loginAmministratore(username, password, pin);
        } else {
            loggato = JLogin.loginUtenteStandard(username, password);
        }
        println("Loggato: " + loggato);
    }
}