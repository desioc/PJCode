/*
import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        // rendiamo le stringhe minuscole
        String s1Min = s1.toLowerCase();
        String s2Min = s2.toLowerCase();
        // poi le confrontiamo sfruttando il metodo compareTo
        return s1Min.compareTo(s2Min);
    }
}
*/
import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        // sfruttiamo il metodo compareToIgnoreCase
        return s1.compareToIgnoreCase(s2);
    }
}