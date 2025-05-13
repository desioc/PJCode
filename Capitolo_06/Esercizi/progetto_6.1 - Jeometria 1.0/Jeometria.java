package com.jeometria;

public class Jeometria {

    public static double calcolaAreaRettangolo(double base, double altezza) {
        return new Rettangolo(base, altezza).calcolaArea();
    }

    public static double calcolaPerimetroRettangolo(double base, double altezza) {
        return new Rettangolo(base, altezza).calcolaPerimetro();
    }

    public static double calcolaAreaTriangolo(double base, double altezza) {
        return new Triangolo(base, altezza, 0, 0).calcolaArea(); // lati non usati per l’area
    }

    public static double calcolaPerimetroTriangolo(double base, double lato1, double lato2) {
        return new Triangolo(base, 0, lato1, lato2).calcolaPerimetro(); // altezza non usata
    }

    public static double calcolaAreaQuadrato(double lato) {
        return new Quadrato(lato).calcolaArea();
    }

    public static double calcolaPerimetroQuadrato(double lato) {
        return new Quadrato(lato).calcolaPerimetro();
    }

    public static double calcolaAreaCerchio(double raggio) {
        return new Cerchio(raggio).calcolaArea();
    }

    public static double calcolaPerimetroCerchio(double raggio) {
        return new Cerchio(raggio).calcolaPerimetro();
    }
}
