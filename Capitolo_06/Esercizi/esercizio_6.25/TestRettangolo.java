package com.jeometria.test;

import com.jeometria.Rettangolo;

public class TestRettangolo {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(5.0, 3.0);
        System.out.println("Base: " + r1.getBase());
        System.out.println("Altezza: " + r1.getAltezza());
        System.out.println("Perimetro: " + r1.calcolaPerimetro());
        System.out.println("Area: " + r1.calcolaArea());
    }
}
