// classe TestJLogin.java
package com.jlogin.test;

import com.jlogin.JLogin;
import java.util.Scanner;

public class TestJLogin  {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        JLogin login = new JLogin();

        String tipo;
        do {
            System.out.println("Utente o Amministratore? ");
            tipo = scanner.nextLine().trim();
        } while (!(tipo.equalsIgnoreCase("Utente") || tipo.equalsIgnoreCase("Amministratore")));

        System.out.println("Inserire username: ");
        String username = scanner.nextLine().trim();

        System.out.println("Inserire password: ");
        String password = scanner.nextLine().trim();

        boolean loggato = false;
        if (tipo.equalsIgnoreCase("Amministratore")) {
            System.out.println("Inserire pin: ");
            String pin = scanner.nextLine().trim();
            loggato = login.loginAmministratore(username, password, pin);
        } else {
            loggato = login.loginUtenteStandard(username, password);
        }

        System.out.println("Loggato: " + loggato);
    }
}
