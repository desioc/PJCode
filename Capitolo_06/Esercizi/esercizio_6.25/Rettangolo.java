package com.jeometria;

public final class Rettangolo {

    private final double base;
    private final double altezza;

    public Rettangolo(double base, double altezza) {
        if (base <= 0 || altezza <= 0) {
            System.out.println("Base e altezza devono essere positivi.");
        }
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public double calcolaPerimetro() {
        return 2 * (base + altezza);
    }

    public double calcolaArea() {
        return base * altezza;
    }
}
