// classe TestRettangolo.java
package com.jeometria.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.jeometria.Rettangolo;
import com.jeometria.ValoreNonValidoException;

public class TestRettangolo {

    @Test
    void testCalcolaAreaPerimetro() {
        Rettangolo r = new Rettangolo(5, 2);
        assertEquals(10, r.calcolaArea(), 0.001);
        assertEquals(14, r.calcolaPerimetro(), 0.001);
    }

    @Test
    void testBaseAltezzaNonValide() {
        try {
            new Rettangolo(-3, 2);
            fail("Era attesa una ValoreNonValidoException.");
        } catch (ValoreNonValidoException e) {
            assertEquals("Base e altezza devono essere positivi.", e.getMessage());
        }

        try {
            new Rettangolo(3, -2);
            fail("Era attesa una ValoreNonValidoException.");
        } catch (ValoreNonValidoException e) {
            assertEquals("Base e altezza devono essere positivi.", e.getMessage());
        }
    }
}