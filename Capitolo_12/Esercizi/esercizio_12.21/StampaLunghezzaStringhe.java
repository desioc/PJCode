import java.util.*;

public class StampaLunghezzaStringhe {    
    public static void main(String args[]) {                                         // Scrivere un metodo che, 
        List<String> parole = List.of("uno", "due", "tre", "quattro", "due", "tre"); // data una lista di stringhe
        parole.stream()
            .distinct()                                                              // escluda i doppioni
            .sorted(String::compareToIgnoreCase)                                       // ordini ignorando maiuscole e minuscole
            .mapToInt(String::length)                                                // usando il metodo mapToInt
            .forEach(System.out::println);                                           // stampi la lunghezza di ogni stringa             
    }
}