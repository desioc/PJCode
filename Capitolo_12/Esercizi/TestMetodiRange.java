import java.util.stream.*;

public class TestMetodiRange {
    public static void main(String args[]) {
        IntStream.range(1, 5).forEach(i -> System.out.print(i + " "));
        System.out.println();
        IntStream.rangeClosed(1, 5).forEach(i -> System.out.print(i + " "));
    }
}