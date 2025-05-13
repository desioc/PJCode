import java.util.*;
import java.io.*;
import java.util.stream.*;

public class TestLinesMethod {
    public static void main(String args[]) {
        try (InputStreamReader ir = new FileReader("/testo.txt");
        BufferedReader reader = new BufferedReader(ir)) {
            Stream<String> lines = reader.lines();
            Optional<String> java = lines.filter(s -> s.contains("Java")).findFirst();
            java.ifPresent(System.out::println);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}