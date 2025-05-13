public class Orchestra {
    public Direttore direttore;
    public Orchestra (Direttore nuovoDirettore) {
        direttore = nuovoDirettore;
    }
    
    public void cambiaDirettore(Direttore nuovoDirettore) {
        direttore = nuovoDirettore;
    }
    
    public void cambiaNomeDirettore(String nuovoNome) {
        direttore.nome = nuovoNome;
    }
}
