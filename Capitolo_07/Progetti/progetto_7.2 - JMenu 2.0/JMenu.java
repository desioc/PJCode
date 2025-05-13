package com.jmenu;

import com.jmenu.piatti.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JMenu {
    private List<Piatto> menu;
    private List<Piatto> piattiOrdinati;

    public JMenu() {
        menu = new ArrayList<>();
        piattiOrdinati = new ArrayList<>();
        inizializzaMenu();
    }

    // inizializzazione del menu con piatti di varie categorie
    private void inizializzaMenu() {
        menu.add(new Antipasto(1, "Bruschette", 5.00));
        menu.add(new Primo(2, "Spaghetti alla Carbonara", 10.50));
        menu.add(new Secondo(3, "Bistecca alla Fiorentina", 20.00));
        menu.add(new Dolce(4, "Tiramisu", 6.00));
    }

    // metodo per mostrare il menu all'utente
    public void mostraMenu() {
        System.out.println("----- Menu -----");
        for (Piatto piatto : menu) {
            System.out.println(piatto);
        }
        System.out.println("0. Termina");
    }

    // metodo per prendere l'ordine dell'utente
    public void prendiOrdine() {
        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            mostraMenu();
            System.out.println("Inserisci il codice del piatto che desideri ordinare (0 per terminare): ");
            scelta = scanner.nextInt();

            if (scelta == 0) {
                break;
            }

            Piatto piattoOrdinato = trovaPiatto(scelta);
            if (piattoOrdinato != null) {
                piattiOrdinati.add(piattoOrdinato);
                System.out.println("Hai ordinato: " + piattoOrdinato.getNome());
            } else {
                System.out.println("Codice non valido, riprova.");
            }

            mostraPiattiOrdinati();

        } while (scelta != 0);

        // mostra il totale alla fine dell'ordine
        mostraTotale();
        System.out.println("Grazie per aver ordinato!");
    }

    // metodo per trovare un piatto nel menu in base al codice
    private Piatto trovaPiatto(int codice) {
        for (Piatto piatto : menu) {
            if (piatto.getCodice() == codice) {
                return piatto;
            }
        }
        return null;
    }

    // metodo per mostrare i piatti ordinati dall'utente
    public void mostraPiattiOrdinati() {
        if (piattiOrdinati.isEmpty()) {
            System.out.println("Non hai ordinato nessun piatto.");
        } else {
            System.out.println("Piatti ordinati finora:");
            for (Piatto piatto : piattiOrdinati) {
                System.out.println(piatto.getNome() + " - € " + String.format("%.2f", piatto.calcolaPrezzo()));
            }
        }
    }

    // metodo per calcolare il totale da pagare
    public double calcolaTotale() {
        double totale = 0;
        for (Piatto piatto : piattiOrdinati) {
            totale += piatto.calcolaPrezzo();
        }
        return totale;
    }

    // metodo per mostrare il totale alla fine dell'ordine
    public void mostraTotale() {
        if (!piattiOrdinati.isEmpty()) {
            double totale = calcolaTotale();
            System.out.println("----- Totale -----");
            System.out.println("Il totale da pagare è: € " + String.format("%.2f", totale));
        } else {
            System.out.println("Non hai ordinato nessun piatto.");
        }
    }

    // metodo main per lanciare l'applicazione
    public static void main(String[] args) {
        JMenu menu = new JMenu();
        menu.prendiOrdine();
    }
}