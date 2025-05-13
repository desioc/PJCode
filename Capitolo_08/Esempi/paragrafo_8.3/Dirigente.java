public class Dirigente extends Dipendente {
    private String orarioDiLavoro;
    
    public Dirigente(int matricola, String nome){
        super(matricola, nome);
    }
    
    public void setOrarioDiLavoro(String orarioDiLavoro) {
        this.orarioDiLavoro = orarioDiLavoro;
    }

    public String getOrarioDiLavoro() {
        return orarioDiLavoro;
    }
}