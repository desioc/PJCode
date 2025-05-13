package com.jeometria;

record Rettangolo(double base, double altezza) {
    double calcolaArea() {
        return base * altezza;
    }

    double calcolaPerimetro() {
        return 2 * (base + altezza);
    }
}
