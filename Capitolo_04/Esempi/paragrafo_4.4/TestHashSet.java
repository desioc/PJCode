import java.util.HashSet;

public class TestHashSet {
    public static void main(String args[]) {
        HashSet <String>set = new HashSet<>(); // inizialmente il set è vuoto
        set.add("c");                          // indica che l’elemento c è stato aggiunto
        set.add("a");                          // indica che l’elemento a è stato aggiunto
        set.add("b");                          // indica che l’elemento b è stato aggiunto
        set.add("b");                          // indica che l’elemento b non è stato aggiunto
        set.add(null);                         // indica che l’elemento null è stato aggiunto
        set.add(null);                         // indica che l’elemento null non è stato aggiunto
        System.out.println(set);               // gli elementi non sono ordinati
    }
}