// classe TestTriangolo
package com.jeometria.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.jeometria.Triangolo;
import com.jeometria.ValoreNonValidoException;

public class TestTriangolo {

    @Test
    void testCalcolaAreaPerimetro() {
        Triangolo t = new Triangolo(3, 4, 5, 6);
        assertEquals(6, t.calcolaArea(), 0.001);
        assertEquals(14, t.calcolaPerimetro(), 0.001);
    }

    @Test
    void testValoriNonValidi() {
        try {
            new Triangolo(0, 4, 5, 6);
            fail("Era attesa una ValoreNonValidoException.");
        } catch (ValoreNonValidoException e) {
            assertEquals("Tutti i lati e l'altezza devono essere positivi.", e.getMessage());
        }

        try {
            new Triangolo(3, -4, 5, 6);
            fail("Era attesa una ValoreNonValidoException.");
        } catch (ValoreNonValidoException e) {
            assertEquals("Tutti i lati e l'altezza devono essere positivi.", e.getMessage());
        }

        try {
            new Triangolo(3, 4, -5, 6);
            fail("Era attesa una ValoreNonValidoException.");
        } catch (ValoreNonValidoException e) {
            assertEquals("Tutti i lati e l'altezza devono essere positivi.", e.getMessage());
        }

        try {
            new Triangolo(3, 4, 5, -6);
            fail("Era attesa una ValoreNonValidoException.");
        } catch (ValoreNonValidoException e) {
            assertEquals("Tutti i lati e l'altezza devono essere positivi.", e.getMessage());
        }
    }
}