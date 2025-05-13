import java.util.List;

public class Appiattimento {
    public static void stampaStringheUniche(List<List<String>> liste) {
        liste.stream()
             .flatMap(List::stream)
             .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<List<String>> liste = List.of(
            List.of("A", "B", "C"),
            List.of("D", "E"),
            List.of("F", "G", "H")
        );
        stampaStringheUniche(liste);
    }
}