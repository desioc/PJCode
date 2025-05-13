import java.util.*;

public class TestIteratorRemove {
    public static void main(String args[]) {
        // creazione lista modificabile a partire da un array di stringhe
        var baroque = new ArrayList<>(Arrays.asList(new String[]{"Adagio" , "Canone" , "Air"})); // lista muutabile
        Iterator<String> iterator = baroque.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().startsWith("C")) {
                iterator.remove();  // rimuove l’elemento alla posizione corrente
            }
        }
        System.out.println(baroque);
    }
}