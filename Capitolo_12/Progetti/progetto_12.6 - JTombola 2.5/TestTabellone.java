package com.jtombola.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
    void testMostraNumeriSelezionati() {
        List<Integer> numeri = Arrays.asList(45, 12, 78, 3, 90);
        numeri.forEach(tabellone::selezionaNumero);

        // Output visivo da verificare a console
        tabellone.mostraNumeriSelezionati();
    }
    
    
    @Test
    void testMostraNumeriRaggruppatiPerDecina() {
        List<Integer> numeri = Arrays.asList(5, 12, 23, 34, 45, 56, 67, 78, 89, 90);
        numeri.forEach(tabellone::selezionaNumero);

        // Output visivo da verificare a console
        tabellone.mostraNumeriRaggruppatiPerDecina();
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