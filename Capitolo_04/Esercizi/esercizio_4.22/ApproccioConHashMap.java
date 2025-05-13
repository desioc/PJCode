void main() {
    HashMap<Integer, Calciatore> squadra = new HashMap<>();

    squadra.put(1, new Calciatore("Akmal Tursunov", RuoloCalciatore.PORTIERE));
    squadra.put(2, new Calciatore("Kyaw Zin Lwin", RuoloCalciatore.DIFENSORE));
    squadra.put(3, new Calciatore("Amirbek Juraboev", RuoloCalciatore.CENTROCAMPISTA));

    // Stampiamo i nomi estraendoli dalla mappa tramite i numeri di maglia
    println("Portiere: " + squadra.get(1).nome);
    println("Difensore: " + squadra.get(2).nome);
    println("Centrocampista: " + squadra.get(3).nome);

    // Proviamo ad aggiungere un altro calciatore con il numero 1
    squadra.put(1, new Calciatore("Khairul Fahmi Che Mat", RuoloCalciatore.PORTIERE));

    println("Dopo sostituzione:");
    println("Portiere: " + squadra.get(1).nome);
}
interface Giocatore {
    void gioca();
}

enum RuoloCalciatore {
    PORTIERE, DIFENSORE, CENTROCAMPISTA, ATTACCANTE;
}

class Calciatore implements Giocatore {
    public String nome;
    public RuoloCalciatore ruolo;
    
    public Calciatore (String n, RuoloCalciatore r) {
        nome = n;
        ruolo = r;
    }
    
    public void gioca() {
        println("Sono " + nome + 
            "e sto giocando a calcio nel ruolo di " + ruolo);
    }
}
