import java.util.*;

public class TestOptionalFlatMap {
    public static void main(String args[]) {
        Optional<String> optionalString = Optional.of("Raskol'nikov");
        Optional<Integer> lengthOptionalMap = optionalString.map(s -> s.length());
        Optional<Optional<Integer>> lengthOptionalMap2 = optionalString.map(s -> Optional.of(s.length()));
        Optional<Integer> lengthOptionalFlatMap = optionalString.flatMap(s -> Optional.of(s.length()));
        Optional<Integer> lengthOptionalInteger = optionalString.flatMap(s -> s.length());

    }
}