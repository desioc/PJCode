import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.function.Function;

public class OperazioniUnary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero: ");
        int numero = scanner.nextInt();

        // operazioni unarie
        UnaryOperator<Integer> incrementaDiDieci = n -> n + 10;
        UnaryOperator<Integer> raddoppia = n -> n * 2;

        int incrementato = incrementaDiDieci.apply(numero);
        System.out.println("Dopo incremento di 10: " + incrementato);

        int raddoppiato = raddoppia.apply(numero);
        System.out.println("Dopo raddoppio: " + raddoppiato);

        // composizione delle due operazioni
        Function<Integer, Integer> combinata = incrementaDiDieci.andThen(raddoppia);
        int combinato = combinata.apply(numero);
        System.out.println("Dopo incremento e raddoppio: " + combinato);

        scanner.close();
    }
}