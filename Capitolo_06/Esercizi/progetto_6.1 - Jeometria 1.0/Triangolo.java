package com.jeometria;

record Triangolo(double base, double altezza, double lato1, double lato2) {
    double calcolaArea() {
        return (base * altezza) / 2;
    }

    double calcolaPerimetro() {
        return base + lato1 + lato2;
    }
}
