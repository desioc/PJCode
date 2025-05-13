import java.util.*;

public class StampaNumeriPari {
    public static void main(String args[]) {
        List<Integer> numeri = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numeri.stream()
            .filter(n -> n % 2 == 0) // filtra i numeri pari
            .map(n -> "Numero " + n) // mappa il numero in stringa
            .forEach(System.out::println); // stampa i numeri
    }
}