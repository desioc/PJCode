import java.util.*;

public class MediaNumeriPari {
    public static void main(String args[]) {
        List<Integer> numeri = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Ottenere il seguente output utilizzando uno 
        numeri.stream()
            .filter(n -> n % 2 == 0) // Filtra i numeri pari
            .map(n -> "Numero " + n)
            .forEach(System.out::println); // Stampa i numeri
        
        // Calcolare la media dei numeri pari utilizzando una pipeline
        double media = numeri.stream()
                           .filter(n -> n % 2 == 0) // Filtra i numeri pari
                           .mapToDouble(n -> n)
                           .average()
                           .orElseGet(() -> 0);
        System.out.println(media);

    }
}