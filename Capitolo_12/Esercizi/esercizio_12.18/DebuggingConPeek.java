import java.util.*;

public class DebuggingConPeek {
    public static void main(String[] args) {
        List<Integer> numeri = List.of(1, 2, 3, 4, 5, 6);
        numeri.stream()
            .peek(n -> System.out.println("Prima del mapping: " + n))
            .map(n -> n * 2)
            .peek(n -> System.out.println("Dopo il mapping: " + n))
            .forEach(System.out::println);
    }
}