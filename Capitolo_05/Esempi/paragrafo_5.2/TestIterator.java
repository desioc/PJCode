import java.util.*;

public class TestIterator {
    public static void main(String args[]) {
        List baroque = List.of("Adagio" , "Canone" , "Air"); // lista immutabile
        Iterator<String> iterator = baroque.iterator(); // otteniamo l’iterator dalla lista
        while (iterator.hasNext()) {                    // ciclo che termina quando non ci sono più ele-menti
            String string = iterator.next();            // otteniamo la stringa alla posizione corrente
            System.out.println(string);                 // stampa della stringa
        }
    }
}