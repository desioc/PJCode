package com.jeometria.test;

import com.jeometria.Jeometria;

public class TestJeometria {
    public static void main(String[] args) {
        System.out.println("Rettangolo: area = " + Jeometria.calcolaAreaRettangolo(5, 3)
                + ", perimetro = " + Jeometria.calcolaPerimetroRettangolo(5, 3));

        System.out.println("Triangolo: area = " + Jeometria.calcolaAreaTriangolo(4, 2)
                + ", perimetro = " + Jeometria.calcolaPerimetroTriangolo(4, 3, 5));

        System.out.println("Quadrato: area = " + Jeometria.calcolaAreaQuadrato(4)
                + ", perimetro = " + Jeometria.calcolaPerimetroQuadrato(4));

        System.out.println("Cerchio: area = " + Jeometria.calcolaAreaCerchio(2)
                + ", perimetro = " + Jeometria.calcolaPerimetroCerchio(2));
    }
}
