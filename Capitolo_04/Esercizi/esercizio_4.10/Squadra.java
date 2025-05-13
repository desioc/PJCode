public class Squadra implements Giocatore {
    public static final byte NUMERO_MAX_CALCIATORI = 11; // costante che dichiara il numero massimo di calciatori 
    public String nome;
    public Calciatore calciatori[];
    
    public Squadra(String n) {
        nome = n;
        calciatori = new Calciatore[NUMERO_MAX_CALCIATORI];
    }
    
    public void gioca() {
        int i = 0;
        while (calciatori[i] != null) {
            calciatori[i].gioca();
            i++;
        }
    }
}