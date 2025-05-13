import java.util.stream.IntStream;

public class StampaIntervalloDiNumeri {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100) // Prende i primi 100 numeri, versione alternativa: iterate(1, n -> n + 1).limit 100 // Genera numeri interi consecutivi a partire da 1
                 .dropWhile(n -> n < 35) // Ignora i numeri minori di 35
                 .takeWhile(n -> n <= 75) // Prende i numeri fino a 75 inclusi
                 .forEach(System.out::println); // Stampa i numeri rimanenti
    }
}