package com.jtombola.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jtombola.Bussolotto;

class TestBussolotto {

    @Test
    void estraiTuttiINumeri() {
        Bussolotto b = new Bussolotto();
        for (int i = 0; i < 90; i++) {
            try {
                b.estraiNumero();
            } catch (Exception e) {
                fail("Unexpected exception: " + e.getMessage());
            }
        }

        try {
            b.estraiNumero();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // ok
        }
    }
}
