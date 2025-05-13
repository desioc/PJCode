import java.util.*;
import java.util.stream.*;

public class TestReduce {
    public static void main(String args[]) {
        Set<String> parole = Set.of("Java" , "C" , "C++" , "C#");
        String parola = parole.stream().reduce("", (p1, p2) -> p1.length() > p2.length() ? p1 : p2);
        System.out.println(parola);
        Optional<String> parolaOptional = parole.stream().reduce((p1, p2) -> p1.length() > p2.length() ? p1 : p2);
        if (parolaOptional.isPresent()) {
             System.out.println(parolaOptional.get());
        } 
    }
}