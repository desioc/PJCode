import java.util.ArrayList;
import java.util.List;

public class TestUtenteRecord {
    public static void main(String[] args) {
        List<String> interessi = new ArrayList<>();
        interessi.add("Letteratura");
        interessi.add("Filosofia");
        Utente utente = new Utente("Dottor Pereira", interessi);
        System.out.println(utente); // stampiamo il metodo toString dell’utente
        List<String> interessiEsterni = utente.interessi(); // Tentativo di modifica della 
        interessi.add("Cucina");                     // lista di interessi dall'esterno
        interessiEsterni.add("Politica");            // lista di interessi dall'esterno
        System.out.println(utente); // La lista originale non viene modificata
         if (interessi instanceof List o1) System.out.println(o1); else System.out.println("ciao");
    }
}