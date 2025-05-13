import java.util.ArrayList;

public class TestArrayList {
    public static void main(String args[]) {
        // ArrayList<String> strings = new ArrayList<String>();
        // ArrayList<String> strings = new ArrayList<>();
        var strings = new ArrayList<String>();
        strings.add("è possibile aggiungere solo String");
        // strings.add(new Punto(80,23)); // errore in compilazione
        System.out.println(strings.get(0));
    }
}