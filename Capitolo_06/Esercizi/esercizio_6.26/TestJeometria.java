package com.jeometria.test;

import com.jeometria.Jeometria;

public class TestJeometria {
    public static void main(String[] args) {
        Jeometria j = new Jeometria();
        
        double base = 5.0;
        double altezza = 3.0;

        double perimetro = j.calcolaPerimetroRettangolo(base, altezza);
        double area = j.calcolaAreaRettangolo(base, altezza);

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }
}