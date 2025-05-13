// classe TestQuadrato
package com.jeometria.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.jeometria.Quadrato;
import com.jeometria.ValoreNonValidoException;

public class TestQuadrato {

    @Test
    void testCalcolaAreaPerimetro() {
        Quadrato q = new Quadrato(3);
        assertEquals(9, q.calcolaArea(), 0.001);
        assertEquals(12, q.calcolaPerimetro(), 0.001);
    }

    @Test
    void testLatoNonValido() {
        try {
            new Quadrato(0);
            fail("Era attesa una ValoreNonValidoException.");
        } catch (ValoreNonValidoException e) {
            assertEquals("Il lato deve essere positivo.", e.getMessage());
        }
    }
}