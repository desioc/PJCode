package com.jmenu;

import com.jmenu.piatti.*;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JMenu {
    // lista dei piatti disponibili nel menu
    private List<Piatto> menu;

    // lista dei piatti ordinati dall’utente
    private List<Piatto> piattiOrdinati;

    public JMenu() {
        // inizializza le liste
        menu = new ArrayList<>();
        piattiOrdinati = new ArrayList<>();

        // carica il menu da file
        caricaMenuDaFile("menu.txt");
    }

    // carica i piatti da un file di testo
    private void caricaMenuDaFile(String nomeFile) {
        Path path = Paths.get(nomeFile);
        if (!Files.exists(path)) {
            System.err.println("File menu.txt non trovato.");
            return;
        }

        try {
            List<String> righe = Files.readAllLines(path);
            for (String riga : righe) {
                String[] parti = riga.split(";");
                if (parti.length != 4) continue;

                String categoria = parti[0].trim();
                int codice = Integer.parseInt(parti[1].trim());
                String nome = parti[2].trim();
                double prezzo = Double.parseDouble(parti[3].trim());

                // crea l’istanza del piatto in base alla categoria
                Piatto piatto = switch (categoria) {
                    case "Antipasto" -> new Antipasto(codice, nome, prezzo);
                    case "Primo" -> new Primo(codice, nome, prezzo);
                    case "Secondo" -> new Secondo(codice, nome, prezzo);
                    case "SecondoPersonalizzato" -> new SecondoPersonalizzato(codice, nome, prezzo);
                    case "Dolce" -> new Dolce(codice, nome, prezzo);
                    default -> null;
                };

                // aggiunge il piatto alla lista
                if (piatto != null) {
                    menu.add(piatto);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Errore nella lettura del menu: " + e.getMessage());
        }
    }

    // mostra il menu all’utente
    public void mostraMenu() {
        System.out.println("----- Menu -----");
        menu.forEach(System.out::println);
        System.out.println("0. Termina");
    }

    // consente di prendere l’ordine dell’utente
    public void prendiOrdine() {
        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            mostraMenu();
            System.out.println("Inserisci il codice del piatto che desideri ordinare (0 per terminare): ");
            scelta = scanner.nextInt();

            if (scelta == 0) break;

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

    // cerca un piatto nel menu in base al codice
    private Piatto trovaPiatto(int codice) {
        return menu.stream()
                   .filter(p -> p.getCodice() == codice)
                   .findFirst()
                   .orElse(null);
    }

    // mostra i piatti ordinati finora
    public void mostraPiattiOrdinati() {
        if (piattiOrdinati.isEmpty()) {
            System.out.println("Non hai ordinato nessun piatto.");
        } else {
            System.out.println("Piatti ordinati finora:");
            piattiOrdinati.forEach(p -> 
                System.out.println(p.getNome() + " - € " + String.format("%.2f", p.calcolaPrezzo())));
        }
    }

    // calcola il totale da pagare
    public double calcolaTotale() {
        return piattiOrdinati.stream()
                             .mapToDouble(Piatto::calcolaPrezzo)
                             .sum();
    }

    // mostra il totale all’utente
    public void mostraTotale() {
        if (!piattiOrdinati.isEmpty()) {
            double totale = calcolaTotale();
            System.out.println("----- Totale -----");
            System.out.println("Il totale da pagare è: € " + String.format("%.2f", totale));
        } else {
            System.out.println("Non hai ordinato nessun piatto.");
        }
    }

    // metodo main per avviare l’applicazione
    public static void main(String[] args) {
        JMenu menu = new JMenu();
        menu.prendiOrdine();
    }
}
