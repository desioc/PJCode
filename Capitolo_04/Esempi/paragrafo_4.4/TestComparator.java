import java.util.*;

public class TestComparator {
    public static void main(String args[]) {
        var list = new ArrayList<String>();
        list.add("Arriva");
        list.add("la");
        list.add("luce");
        list.add("su");
        list.add("Urano");
        System.out.println("ArrayList ordinato secondo l'ordine di aggiunta degli elementi " + list);
        // per ordinare la collezione possiamo sfruttare il metodo sort di Collections
        Collections.sort(list, new StringComparator());
        System.out.println("ArrayList ordinato secondo l'ordine alfabetico " + list); // L'output sarà ordinato secondo l'ordine standard delle stringhe come richiesto: 
        // [Arriva, Urano, la, luce, su]
    }
}