// classe di test aggiornata
package com.jmmobiliare.test;

import com.jmmobiliare.Jmmobiliare;
import com.jmmobiliare.dati.Appartamento;
import com.jmmobiliare.dati.Garage;
import com.jmmobiliare.dati.Palazzo;
import com.jmmobiliare.exception.ImmobileInvalidoException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestJmmobiliare {

    @Test
    void testInserisciAppartamento() {
        Jmmobiliare j = new Jmmobiliare();
        Appartamento appartamento = new Appartamento(60, "Via Roma 10" , 2);
        try {
            j.inserisciImmobile(appartamento);
        } catch (Exception e) {
            fail("Non ci si aspetta un'eccezione: " + e.getMessage());
        }
    }

    @Test
    void testInserisciGarage() {
        Jmmobiliare j = new Jmmobiliare();
        Garage garage = new Garage(25, "Via Napoli 12" , 2);
        try {
            j.inserisciImmobile(garage);
        } catch (Exception e) {
            fail("Non ci si aspetta un'eccezione: " + e.getMessage());
        }
    }

    @Test
    void testInserisciPalazzo() {
        Jmmobiliare j = new Jmmobiliare();
        List<Appartamento> appartamenti = List.of(
        new Appartamento(50, "Via Torino 1" , 1),
        new Appartamento(70, "Via Torino 1" , 2)
        );
        Palazzo palazzo = new Palazzo(appartamenti);
        try {
            j.inserisciImmobile(palazzo);
        } catch (Exception e) {
            fail("Non ci si aspetta un'eccezione: " + e.getMessage());
        }
    }

    @Test
    void testInserisciImmobileNull() {
        Jmmobiliare j = new Jmmobiliare();
        try {
            j.inserisciImmobile(null);
        } catch (Exception e) {
            fail("Non ci si aspetta un'eccezione: " + e.getMessage());
        }
    }
}