// classe TestJeometria
package com.jeometria.test;

import com.jeometria.*;

public class TestJeometria {
    public static void main(String[] args) {
        Misurabile rettangolo = new Rettangolo(5, 3);
        Misurabile triangolo = new Triangolo(4, 2, 3, 5);
        Misurabile quadrato = new Quadrato(4);
        Misurabile cerchio = new Cerchio(2);

        System.out.println("Rettangolo: area = " + Jeometria.calcolaArea(rettangolo) + 
                           ", perimetro = " + Jeometria.calcolaPerimetro(rettangolo));
        System.out.println("Triangolo: area = " + Jeometria.calcolaArea(triangolo) +
                           ", perimetro = " + Jeometria.calcolaPerimetro(triangolo));
        System.out.println("Quadrato: area = " + Jeometria.calcolaArea(quadrato) +
                           ", perimetro = " + Jeometria.calcolaPerimetro(quadrato));
        System.out.println("Cerchio: area = " + Jeometria.calcolaArea(cerchio) +
                           ", perimetro = " + Jeometria.calcolaPerimetro(cerchio));
    }
}
