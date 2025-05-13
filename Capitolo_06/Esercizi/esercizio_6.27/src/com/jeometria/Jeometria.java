package com.jeometria;

public class Jeometria {

    public double calcolaPerimetroRettangolo(double base, double altezza) {
        Rettangolo r = new Rettangolo(base, altezza);
        return r.calcolaPerimetro();
    }

    public double calcolaAreaRettangolo(double base, double altezza) {
        Rettangolo r = new Rettangolo(base, altezza);
        return r.calcolaArea();
    }
}
