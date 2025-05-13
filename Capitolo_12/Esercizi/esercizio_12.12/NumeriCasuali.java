import java.util.stream.*;
import java.util.*;

public class NumeriCasuali {
    public static void main(String args[]) {
        System.out.println("Numeri casuali con Math.random");
        Stream.generate(Math::random)
            .limit(100)
            .forEach(System.out::println);

        System.out.println("\nNumeri casuali con Random.longs");
        new Random().longs()
            .filter(n -> n > 0)
            .limit(100)
            .forEach(System.out::println);
    }
}