package com.jtombola.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jtombola.EstrazioneCasuale;

class TestEstrazioneCasuale {

    @Test
    void testEstrazioneCompleta() {
        EstrazioneCasuale estrazione = new EstrazioneCasuale();
        for (int i = 0; i < 90; i++) {
            int numero = estrazione.estrai();
            assertTrue(numero >= 1 && numero <= 90);
        }

        try {
            estrazione.estrai();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // ok
        }
    }

    @Test
    void testNumeriRimasti() {
        EstrazioneCasuale estrazione = new EstrazioneCasuale();
        estrazione.estrai();
        assertEquals(89, estrazione.numeriRimasti());
    }
}
