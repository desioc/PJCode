// record Cerchio
package com.jeometria;

public record Cerchio(double raggio) implements Misurabile {

    @Override
    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * Math.PI * raggio;
    }
}