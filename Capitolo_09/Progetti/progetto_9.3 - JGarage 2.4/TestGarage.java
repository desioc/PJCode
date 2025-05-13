// classe di test TestGarage
package com.jgarage;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jgarage.business.Garage;
import com.jgarage.exception.PostoNonDisponibileException;
import com.jgarage.model.Auto;
import com.jgarage.model.Dimensione;
import com.jgarage.model.Moto;

class TestGarage {

    private Garage garage;

    @BeforeEach
    void setUp() {
        garage = new Garage();
    }

    @Test
    void testAccessoAutoDisponibile() {
        Auto auto = new Auto("AA111AA", Dimensione.MEDIA);
        garage.permettiAccesso(auto);
        assertTrue(garage.cercaVeicolo("AA111AA"));
    }

    @Test
    void testAccessoAutoSenzaPosto() {
        Auto a1 = new Auto("A1", Dimensione.GRANDE);
        Auto a2 = new Auto("A2", Dimensione.GRANDE);
        Auto a3 = new Auto("A3", Dimensione.GRANDE);
        garage.permettiAccesso(a1);
        garage.permettiAccesso(a2);
        assertThrows(PostoNonDisponibileException.class, () -> garage.permettiAccesso(a3));
    }

    @Test
    void testAccessoMotoSenzaAccessoriNelPostoMoto() {
        Moto m1 = new Moto("M1", false);
        Moto m2 = new Moto("M2", false);
        garage.permettiAccesso(m1);
        garage.permettiAccesso(m2);
        assertTrue(garage.cercaVeicolo("M1"));
    }

    @Test
    void testAccessoMotoSenzaAccessoriNelPostoAuto() {
        Moto m1 = new Moto("M1", false);
        Moto m2 = new Moto("M2", false);
        Moto m3 = new Moto("M3", false);
        garage.permettiAccesso(m1);
        garage.permettiAccesso(m2);
        garage.permettiAccesso(m3);
        assertTrue(garage.cercaVeicolo("M3"));
    }

    @Test
    void testAccessoMotoConAccessoriSenzaPosto() {
        Moto m1 = new Moto("M1", true);
        Moto m2 = new Moto("M2", true);
        Moto m3 = new Moto("M3", true);
        garage.permettiAccesso(m1);
        garage.permettiAccesso(m2);
        assertThrows(PostoNonDisponibileException.class, () -> garage.permettiAccesso(m3));
    }

    @Test
    void testUscitaVeicolo() {
        Auto auto = new Auto("EXIT123", Dimensione.PICCOLA);
        garage.permettiAccesso(auto);
        garage.permettiUscita(auto);
        assertFalse(garage.cercaVeicolo("EXIT123"));
    }

}