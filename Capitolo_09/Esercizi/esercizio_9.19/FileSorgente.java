public class FileSorgente extends File {
    private String contenuto;
    
    public FileSorgente(String nome, TipoFile tipo) {
        super(nome, tipo);
        this.contenuto = "";
    }

    public FileSorgente(String nome, TipoFile tipo, String contenuto) {
        this(nome, tipo);
        this.contenuto = contenuto;
    }
    
    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    // soluzione punto 1
    public void aggiungiTesto(String testo) {
        if (testo == null) {
            throw new IllegalArgumentException(
                "Il testo da aggiungere non può essere nullo.");
        }
        contenuto += testo;
    }

    // soluzione punto 2
    public void aggiungiTesto(String testo, int posizione) {
        try {            
            if (testo == null) {
                throw new IllegalArgumentException(
                    "Il testo da aggiungere non può essere nullo.");
            }
            if (posizione < 0 || posizione > contenuto.length()) {
                throw new IndexOutOfBoundsException(
                    "Posizione non valida: " + posizione);
            }
            contenuto = contenuto.substring(0, posizione) + testo + 
                contenuto.substring(posizione);
        } finally {
            System.out.println("Operazione di modifica completata.");
        }
    }

}