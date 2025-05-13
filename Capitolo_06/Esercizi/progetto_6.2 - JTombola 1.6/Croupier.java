package com.jtombola;

public class Croupier {
    private Bussolotto bussolotto;
    private Tabellone tabellone;

    // Costruttore
    public Croupier() {
        bussolotto = new Bussolotto();
        tabellone = Tabellone.getInstance();
    }

    // Metodo per estrarre e selezionare un numero
    public void estraiNumero() {
        System.out.println("Estraggo un numero dal bussolotto...");
        int numeroEstratto = bussolotto.estraiNumero();
        System.out.println("Estratto il numero " + numeroEstratto + ".");
        
        System.out.println("Seleziono il numero " + numeroEstratto + " sul tabellone...");
        tabellone.selezionaNumero(numeroEstratto);
    }

    // Metodo per verificare quanti numeri sono rimasti nel bussolotto
    public void numeriRimasti() {
        System.out.println("Numeri rimasti nel bussolotto: " + bussolotto.numeriRimasti());
    }
}