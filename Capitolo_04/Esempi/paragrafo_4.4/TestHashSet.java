import java.util.HashSet;

public class TestHashSet {
    public static void main(String args[]) {
        HashSet <String>set = new HashSet<>(); // inizialmente il set � vuoto
        set.add("c");                          // indica che l�elemento c � stato aggiunto
        set.add("a");                          // indica che l�elemento a � stato aggiunto
        set.add("b");                          // indica che l�elemento b � stato aggiunto
        set.add("b");                          // indica che l�elemento b non � stato aggiunto
        set.add(null);                         // indica che l�elemento null � stato aggiunto
        set.add(null);                         // indica che l�elemento null non � stato aggiunto
        System.out.println(set);               // gli elementi non sono ordinati
    }
}