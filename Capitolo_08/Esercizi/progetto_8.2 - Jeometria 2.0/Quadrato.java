// record Quadrato
package com.jeometria;

public record Quadrato(double lato) implements Misurabile {
    @Override
    public double calcolaArea() {
        return lato * lato;
    }

    @Override
    public double calcolaPerimetro() {
        return lato * 4;
    }
}
