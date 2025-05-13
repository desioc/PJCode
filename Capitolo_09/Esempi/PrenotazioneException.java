//@SuppressWarnings("serial") // vedi approfondimento 9.2
public class PrenotazioneException extends Exception {
//    private static final long serialVersionUID = 8144963013726442881L; // vedi approfondimento 9.2
    public PrenotazioneException() {
        // Il costruttore di Exception chiamato inizializza la
        // variabile privata message
        super("Problema con la prenotazione");
    }
    @Override
    public String toString() {
        return getMessage() + ": posti esauriti!";
    }
}