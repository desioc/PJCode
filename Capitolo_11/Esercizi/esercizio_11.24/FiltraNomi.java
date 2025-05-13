import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FiltraNomi {
    public static void main(String[] args) {
        // 1. lista di nomi
        List<String> nomi = List.of("Alessandro", "Marco", "Anna", "Luca", "Antonio", "Giulia");

        // 2. predicate per filtrare i nomi che iniziano con 'A'
        Predicate<String> iniziaConA = nome -> nome.startsWith("A");

        // 3. filtra i nomi usando lo stream
        List<String> nomiFiltrati = nomi.stream()
            .filter(iniziaConA)
            .collect(Collectors.toList());

        // 4. stampa i nomi filtrati (senza prefisso)
        System.out.println("Nomi che iniziano con 'A':");
        nomiFiltrati.forEach(System.out::println);

        // 5. consumer per stampare con prefisso
        Consumer<String> stampaConPrefisso = nome -> System.out.println("Nome valido: " + nome);

        // 6. usa il Consumer per stampare i nomi filtrati
        System.out.println("\nStampa con prefisso:");
        nomiFiltrati.forEach(stampaConPrefisso);
    }
}
