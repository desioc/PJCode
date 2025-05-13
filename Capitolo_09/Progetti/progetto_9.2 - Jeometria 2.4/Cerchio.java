// record Cerchio
package com.jeometria;

public record Cerchio(double raggio) implements Misurabile {
    public Cerchio {
        if (raggio <= 0) {
            throw new ValoreNonValidoException("Il raggio deve essere positivo.");
        }
    }

    @Override
    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * Math.PI * raggio;
    }
}