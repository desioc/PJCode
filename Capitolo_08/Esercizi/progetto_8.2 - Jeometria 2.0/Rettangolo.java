// record Rettangolo
package com.jeometria;

public record Rettangolo(double base, double altezza) implements Misurabile {

    @Override
    public double calcolaArea() {
        return base * altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (base + altezza);
    }
}