public class Tennista implements Giocatore {
    public String nome;
    
    public Tennista (String n){
        nome = n;
    }
    
    public void gioca() {
        System.out.println("Sono " + nome + " e sto giocando a tennis!");
    }
    
    public String toString() {
        return nome;
    }
}