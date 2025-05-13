// classe Triangolo
package com.jeometria;

public record Triangolo(double base, double altezza, double lato1, double lato2) implements Misurabile {

    @Override
    public double calcolaArea() {
        return (base * altezza) / 2;
    }

    @Override
    public double calcolaPerimetro() {
        return base + lato1 + lato2;
    }
}