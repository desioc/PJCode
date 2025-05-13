package com.jeometria;

record Cerchio(double raggio) {
    double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    double calcolaPerimetro() {
        return 2 * Math.PI * raggio;
    }
}
