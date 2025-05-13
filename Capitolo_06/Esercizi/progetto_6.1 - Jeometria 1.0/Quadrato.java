package com.jeometria;

record Quadrato(double lato) {
    double calcolaArea() {
        return lato * lato;
    }

    double calcolaPerimetro() {
        return 4 * lato;
    }
}
