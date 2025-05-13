// classe TestGarage
package com.jgarage;

import com.jgarage.business.Garage;
import com.jgarage.model.*;

public class TestGarage {
    public static void main(String[] args) {
        Garage garage = new Garage();

        var auto1 = new Auto("ZF978324PO", Dimensione.MEDIA);
        var auto2 = new Auto("PT989798YU", Dimensione.GRANDE);
        var auto3 = new Auto("YU983950QA", Dimensione.PICCOLA);

        var moto1 = new Moto("MO123AB", false); // senza accessori
        var moto2 = new Moto("MO456CD", true);  // con accessori
        var moto3 = new Moto("MO789EF", false); // senza accessori (sposteremo su posto auto PICCOLA)

        // inseriamo auto
        System.out.println("\n--- Alcune auto stanno entrando ---");
        garage.permettiAccesso(auto1);
        garage.permettiAccesso(auto2);
        garage.permettiAccesso(auto3);

        // inseriamo moto
        System.out.println("\n--- Alcune moto stanno entrando ---");
        garage.permettiAccesso(moto1);
        garage.permettiAccesso(moto2);
        garage.permettiAccesso(moto3); // dovrà andare nei posti PICCOLA perché i posti moto sono pieni

        // stato dopo gli ingressi
        System.out.println("\n--- Stato dopo ingressi ---");
        System.out.println("Numero veicoli in garage: " + garage.numeroVeicoliParcheggiati());
        System.out.println("Moto presenti: " + garage.getParcheggiMoto());
        System.out.println("Auto presenti: " + garage.getParcheggiAuto());

        // verifica cercaVeicolo
        System.out.println("\n--- Verifica ricerca veicoli ---");
        System.out.println("Cerco auto1 (MEDIA): " + garage.cercaVeicolo(auto1.targa()));
        System.out.println("Cerco moto2 (accessori): " + garage.cercaVeicolo(moto2.targa()));
        System.out.println("Cerco targa inesistente: " + garage.cercaVeicolo("XYZ000"));

        // uscite
        System.out.println("\n--- Un'auto e una moto stanno uscendo ---");
        garage.permettiUscita(auto1);
        garage.permettiUscita(moto1);

        // stato dopo uscite
        System.out.println("\n--- Stato dopo uscite ---");
        System.out.println("Numero veicoli in garage: " + garage.numeroVeicoliParcheggiati());
        System.out.println("Moto presenti: " + garage.getParcheggiMoto());
        System.out.println("Auto presenti: " + garage.getParcheggiAuto());
    }
}
