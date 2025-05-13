// classe TestCerchio
package com.jeometria.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.jeometria.Cerchio;
import com.jeometria.ValoreNonValidoException;

public class TestCerchio {

    @Test
    void testCalcolaAreaPerimetro() {
        Cerchio c = new Cerchio(2);
        assertEquals(Math.PI * 4, c.calcolaArea(), 0.001);
        assertEquals(2 * Math.PI * 2, c.calcolaPerimetro(), 0.001);
    }

    @Test
    void testRaggioNonValido() {
        try {
            new Cerchio(-1);
            fail("Era attesa una ValoreNonValidoException.");
        } catch (ValoreNonValidoException e) {
            assertEquals("Il raggio deve essere positivo.", e.getMessage());
        }
    }
}