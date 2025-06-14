import java.util.*;
import java.util.stream.*;

public class TestTerminalMethods {
    public static void main(String args[]) {
        // metodi match
        Set<Integer> ints = Set.of(-5,-4,-3,-2,-1,0,1,2,3,4,5);
        boolean areAllPositive = ints.stream().allMatch(i -> i>=0);
        System.out.println("areAllPositive: " + areAllPositive);
        boolean isAnyNegative = ints.stream().anyMatch(i -> i<0);
        System.out.println("isAnyNegative: " + isAnyNegative);
        boolean areAllNonZero = ints.stream().noneMatch(i -> i==0);
        System.out.println("areAllNonZero: " + areAllNonZero);
        // metodi find
        List<String> strings = List.of("1","2","3","4");
        Optional<String> findFirstOptional = strings.stream().findFirst();
        if (findFirstOptional.isPresent()) {
            System.out.println("findFirstOptional.get: " + findFirstOptional.get());
        }
        Optional<String> findAnyOptional = strings.parallelStream().findAny();
        if (!findAnyOptional.isEmpty()) {
            System.out.println("findAnyOptional.get: " + findAnyOptional.get());
        }

    }
}