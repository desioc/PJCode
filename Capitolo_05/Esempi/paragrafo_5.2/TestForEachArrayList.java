import java.util.*;

public class TestForEachArrayList {
    public static void main(String args[]) {
        List<String> baroque = List.of("Adagio" , "Canone" , "Air"); // lista di tre elementi
        // Utilizziamo il metodo forEach per iterare su ogni elemento della lista
        baroque.forEach(s -> System.out.println(s)); // stampa ogni elemento della lista
    }
}