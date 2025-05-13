package com.jtombola.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jtombola.Tabellone;

class TestTabellone {

    private Tabellone tabellone;

    @BeforeEach
    void setUp() {
        tabellone = Tabellone.getInstance();
    }

    @Test
    void testSelezioneNumero() {
        int numero = 45;
        tabellone.selezionaNumero(numero);
        assertTrue(tabellone.contiene(numero));
    }

    @Test
    void testNumeroGiaSelezionato() {
        int numero = 60;
        tabellone.selezionaNumero(numero);
        tabellone.selezionaNumero(numero);
        assertTrue(tabellone.contiene(numero));
    }

    @Test
    void testNumeroNonValido() {
        try {
            tabellone.selezionaNumero(0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // ok
        }

        try {
            tabellone.selezionaNumero(91);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // ok
        }
    }
}
