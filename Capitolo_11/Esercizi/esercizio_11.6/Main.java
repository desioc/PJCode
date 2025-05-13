public class Main {
    public static void main(String[] args) {
        GestoreAzioni gestore = new GestoreAzioni();
        Documento documento = new Documento("Relazione Annuale");

        // classe anonima per stampare il documento
        gestore.eseguiAzione(new Azione() {
            @Override
            public void esegui(Documento documento) {
                System.out.println("Sto stampando il documento: " + documento.getTitolo());
            }

            @Override
            public String descrizione() {
                return "Stampa del documento";
            }
        }, documento);

        // classe anonima per archiviare il documento
        gestore.eseguiAzione(new Azione() {
            @Override
            public void esegui(Documento documento) {
                System.out.println("Sto archiviando il documento: " + documento.getTitolo());
            }

            @Override
            public String descrizione() {
                return "Archiviazione del documento";
            }
        }, documento);
    }
}