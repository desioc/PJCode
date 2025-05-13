// classe Jeometria
package com.jeometria;

import java.util.List;

public class Jeometria {

    public static double calcolaArea(Misurabile misurabile) {
        return misurabile.calcolaArea();
    }

    public static double calcolaPerimetro(Misurabile misurabile) {
        return misurabile.calcolaPerimetro();
    }

    public static double sommaAree(List<Misurabile> figure) {
        return figure.stream()
            .mapToDouble(Misurabile::calcolaArea)
            .sum();
    }

    public static double sommaPerimetri(List<Misurabile> figure) {
        return figure.stream()
            .mapToDouble(Misurabile::calcolaPerimetro)
            .sum();
    }
}