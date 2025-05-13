package com.jtombola;

public class Croupier {

    private final Bussolotto bussolotto = new Bussolotto();
    private final Tabellone tabellone = Tabellone.getInstance();

    public int estraiNumero() {
        int numero = bussolotto.estraiNumero();
        tabellone.selezionaNumero(numero);
        return numero;
    }

    public int numeriRimasti() {
        return bussolotto.numeriRimasti();
    }

    public Tabellone getTabellone() {
        return tabellone;
    }
}
