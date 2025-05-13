import java.util.*;

public class TestHashSetDaOrdinare {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("Arriva");
        strings.add("la");
        strings.add("luce");
        strings.add("su");
        strings.add("Urano");
        strings.add("luce");
        System.out.println(strings);
        // per ordinare la collezione possiamo sfruttare un ArrayList e il metodo sort di Collections
        var list = new ArrayList<String>(strings);
        System.out.println(list); // stampando la lista vedremo che l'ordine degli elementi � uguale a quello dell'HashSet
        // non ci resta altro che ordinare gli elementi mediante il metodo sort di Collections
        Collections.sort(list);
        System.out.println(list); // L'output sar� ordinato secondo l'ordine standard delle stringhe come richiesto: 
        // [Arriva, Urano, la, luce, su]
        
    }
}