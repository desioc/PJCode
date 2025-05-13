import java.util.*;

public class TestForEachStream {
    public static void main(String args[]) {
        List<String> baroque = List.of("Adagio" , "Canone" , "Air"); // lista di tre elementi
        // Creiamo uno stream, filtriamo le stringhe che iniziano con "A" e le stampiamo
        baroque.stream().filter(s -> s.startsWith("A")).forEach(s -> System.out.println(s));
    }
}