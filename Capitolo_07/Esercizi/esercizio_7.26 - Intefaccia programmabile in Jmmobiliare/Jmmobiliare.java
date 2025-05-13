// classe di test
package com.jmmobiliare;

import com.jmmobiliare.dati.*;

import java.util.List;

public class Jmmobiliare {

    public void inserisciAppartamento(Appartamento appartamento) {
        System.out.println("Appartamento inserito correttamente:");
        System.out.println(appartamento);
        System.out.println();
    }

    public void inserisciGarage(Garage garage) {
        System.out.println("Garage inserito correttamente:");
        System.out.println(garage);
        System.out.println();
    }

    public void inserisciPalazzo(Palazzo palazzo) {
        System.out.println("Palazzo inserito correttamente:");
        System.out.println(palazzo);
        System.out.println();
    }

    public static void main(String[] args) {
        Jmmobiliare jmmobiliare = new Jmmobiliare();

        Appartamento appartamento = new Appartamento(80, "Via Roma 10", 2);
        Garage garage = new Garage(25, "Via Napoli 20", 1);

        jmmobiliare.inserisciAppartamento(appartamento);
        jmmobiliare.inserisciGarage(garage);

        // Test 1: palazzo valido
        try {
            Palazzo palazzoValido = new Palazzo(List.of(
                    new Appartamento(50, "Piazza Dante 1", 1),
                    new Appartamento(70, "Piazza Dante 1", 2)
            ));
            jmmobiliare.inserisciPalazzo(palazzoValido);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore nella creazione del palazzo valido: " + e.getMessage());
        }

        // Test 2: palazzo con indirizzi diversi (lancia eccezione)
        try {
            Palazzo palazzoErrato = new Palazzo(List.of(
                    new Appartamento(60, "Via Milano 5", 1),
                    new Appartamento(75, "Via Torino 15", 2)
            ));
            jmmobiliare.inserisciPalazzo(palazzoErrato);
        } catch (IllegalArgumentException e) {
            System.out.println("Eccezione prevista nella creazione del palazzo con indirizzi diversi:\n" 
                + e.getMessage());
        }
    }
}
