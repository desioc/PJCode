import java.util.*;

public class MediaNumeriDispari {
    public static void main(String args[]) {
        List<Integer> numeri = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        double media = numeri.stream()
                           .filter(n -> n % 2 != 0) // filtra i numeri dispari
                           .mapToDouble(n -> n) // mappa in numeri double
                           .average() // restituisce la media in un OptionalDouble
                           .orElseGet(() -> 0); // restituisce 0 se lo stream è vuoto
        System.out.println("Media numeri dispari: " + media);
    }
}