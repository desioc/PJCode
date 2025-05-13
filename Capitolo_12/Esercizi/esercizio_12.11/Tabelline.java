import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tabelline {

    // metodo con Stream.iterate e limit
    static void stampaTabellinaIterate(int numero) {
        Stream.iterate(numero, n -> n + numero)
              .limit(10)
              .forEach(System.out::println);
    }

    // metodo alternativo con IntStream.rangeClosed
    static void stampaTabellinaRange(int numero) {
        IntStream.rangeClosed(1, 10)
                 .map(n -> n * numero)
                 .forEach(System.out::println);
    }

    // metodo main per testare entrambi
    public static void main(String[] args) {
        System.out.println("Tabellina di 7 con iterate:");
        stampaTabellinaIterate(7);

        System.out.println("\nTabellina di 7 con rangeClosed:");
        stampaTabellinaRange(7);
    }
}
