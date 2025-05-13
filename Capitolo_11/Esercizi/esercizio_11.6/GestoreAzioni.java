
// Classe GestoreAzioni
public class GestoreAzioni {
    public void eseguiAzione(Azione azione, Documento documento) {
        System.out.println("Azione: " + azione.descrizione());
        azione.esegui(documento);
    }
}