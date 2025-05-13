package com.jeometria;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Jeometria {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Benvenuto in Jeometria 3.0!");

            while (true) {
                // menu figure
                System.out.println("\nScegli una figura geometrica:");
                System.out.println("1. Quadrato");
                System.out.println("2. Rettangolo");
                System.out.println("3. Triangolo");
                System.out.println("4. Cerchio");
                System.out.println("0. Esci");

                int sceltaFigura = scanner.nextInt();
                scanner.nextLine(); // consuma newline

                if (sceltaFigura == 0) break;

                // menu operazioni
                System.out.println("Scegli l'operazione:");
                System.out.println("1. Area");
                System.out.println("2. Perimetro");

                int sceltaOperazione = scanner.nextInt();
                scanner.nextLine(); // consuma newline

                Misurabile figura = null;

                try {
                    switch (sceltaFigura) {
                        case 1 -> {
                            // quadrato
                            System.out.print("Inserisci il lato: ");
                            double lato = scanner.nextDouble();
                            figura = new Quadrato(lato);
                        }
                        case 2 -> {
                            // rettangolo
                            System.out.print("Inserisci base: ");
                            double base = scanner.nextDouble();
                            System.out.print("Inserisci altezza: ");
                            double altezza = scanner.nextDouble();
                            figura = new Rettangolo(base, altezza);
                        }
                        case 3 -> {
                            // triangolo
                            System.out.print("Inserisci base: ");
                            double base = scanner.nextDouble();
                            System.out.print("Inserisci lato1: ");
                            double lato1 = scanner.nextDouble();
                            System.out.print("Inserisci lato2: ");
                            double lato2 = scanner.nextDouble();
                            System.out.print("Inserisci altezza: ");
                            double altezza = scanner.nextDouble();
                            figura = new Triangolo(base, lato1, lato2, altezza);
                        }
                        case 4 -> {
                            // cerchio
                            System.out.print("Inserisci il raggio: ");
                            double raggio = scanner.nextDouble();
                            figura = new Cerchio(raggio);
                        }
                        default -> System.out.println("Figura non valida.");
                    }

                    if (figura != null) {
                        double risultato = (sceltaOperazione == 1)
                                ? figura.calcolaArea()
                                : figura.calcolaPerimetro();

                        System.out.printf("Risultato: %.2f%n", risultato);

                        // salva su file
                        String output = LocalDateTime.now() + " -> " + figura.getClass().getSimpleName()
                                + " | " + (sceltaOperazione == 1 ? "Area" : "Perimetro")
                                + " = " + risultato;

                        salvaOperazione(output);
                    }
                } catch (Exception e) {
                    System.out.println("Errore: " + e.getMessage());
                }

                scanner.nextLine(); // consuma newline residuo
            }
        }

        System.out.println("Arrivederci!");
    }

    // salva l'output su file operazioni.txt
    private static void salvaOperazione(String contenuto) {
        Path file = Paths.get("operazioni.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            writer.write(contenuto);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Errore nel salvataggio su file: " + e.getMessage());
        }
    }
    
    // calcola l'area di una figura
    public static double calcolaArea(Misurabile m) {
        if (m == null) throw new NullPointerException("Figura nulla");
        return m.calcolaArea();
    }

    // calcola il perimetro di una figura
    public static double calcolaPerimetro(Misurabile m) {
        if (m == null) throw new NullPointerException("Figura nulla");
        return m.calcolaPerimetro();
    }

    // somma delle aree in una lista
    public static double sommaAree(List<Misurabile> figure) {
        return figure.stream().mapToDouble(Misurabile::calcolaArea).sum();
    }

    // somma dei perimetri in una lista
    public static double sommaPerimetri(List<Misurabile> figure) {
        return figure.stream().mapToDouble(Misurabile::calcolaPerimetro).sum();
    }

}