import java.util.*;
import java.util.stream.*;

public class TestIfPresentOrElse {
    public static void main(String args[]) {
        List<Integer> numeri = List.of(1, 3, 5, 7, 9);
        Optional<Integer> numeroTrovato = numeri.stream()
            .filter(n -> n > 4) // filtriamo i numeri maggiori di 4
            .findFirst(); // prendiamo il primo numero delle occorrenze filtrate

        numeroTrovato.ifPresentOrElse(
            n -> System.out.println("Numero trovato: "  + n), // azione se presente
        () -> System.out.println("Nessun numero trovato.") // azione se assente 
        );

    }
}