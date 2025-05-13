public class Calciatore implements Giocatore {
    public String nome;
    public RuoloCalciatore ruolo;
    
    public Calciatore (String n, RuoloCalciatore r){
        nome = n;
        ruolo = r;
    }
    
    public void gioca() {
        System.out.println("Sono " + nome + "e sto giocando a calcio nel ruolo di " + ruolo);
    }
}