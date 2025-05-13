package com.jtombola.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.jtombola.Croupier;

class TestCroupier {

    @Test
    void testEstrazioneENumeroRegistratoSuTabellone() {
        Croupier croupier = new Croupier();
        int numero = croupier.estraiNumero();
        assertTrue(numero >= 1 && numero <= 90);
        assertTrue(croupier.getTabellone().contiene(numero));
    }

    @Test
    void testNumeriRimastiDiminuiscono() {
        Croupier croupier = new Croupier();
        int prima = croupier.numeriRimasti();
        croupier.estraiNumero();
        int dopo = croupier.numeriRimasti();
        assertEquals(prima - 1, dopo);
    }
}
