/**
 * Rappresenta una squadra di calcio composta da un massimo di 11 calciatori.
 * Implementa l'interfaccia Giocatore.
 */
public class Squadra implements Giocatore {

    /** 
     * Costante che rappresenta il numero massimo di calciatori in una squadra.   
     */
    public static final byte NUMERO_MAX_CALCIATORI = 11;

    /** Nome della squadra. */
    public String nome;

    /** Array di calciatori che compongono la squadra. */
    public Calciatore calciatori[];

    /**
     * Costruisce una nuova squadra con il nome specificato.
     *
     * @param n il nome della squadra
     */
    public Squadra(String n) {
        nome = n;
        calciatori = new Calciatore[NUMERO_MAX_CALCIATORI];
    }

    /**
     * Permette a tutti i calciatori della squadra di giocare,
     * chiamando il metodo gioca() su ogni calciatore non nullo.
     */
    public void gioca() {
        int i = 0;
        while (calciatori[i] != null) {
            calciatori[i].gioca();
            i++;
        }
    }
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
        System.out.println("Sono " + nome + 
            "e sto giocando a calcio nel ruolo di " + ruolo);
    }
}
