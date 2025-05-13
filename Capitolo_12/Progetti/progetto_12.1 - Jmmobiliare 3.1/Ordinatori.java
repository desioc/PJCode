package com.jmmobiliare;

import com.jmmobiliare.dati.Immobile;
import com.jmmobiliare.dati.Vendibile;

import java.util.Comparator;

public class Ordinatori {

    public static Comparator<Immobile> perPrezzoAscendente() {
        return Comparator.comparingDouble(i -> ((Vendibile) i).getPrezzo());
    }

    public static Comparator<Immobile> perPrezzoDiscendente() {
        return (i1, i2) -> Double.compare(
            ((Vendibile) i2).getPrezzo(),
            ((Vendibile) i1).getPrezzo()
        );
    }

    public static Comparator<Immobile> perMetriQuadriAscendente() {
        return Comparator.comparingDouble(Immobile::getMetriQuadri);
    }

    public static Comparator<Immobile> perMetriQuadriDiscendente() {
        return (i1, i2) -> Double.compare(i2.getMetriQuadri(), i1.getMetriQuadri());
    }
} 
