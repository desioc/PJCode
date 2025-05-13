import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Esercizio5_13 {
    public static void main(String args[]) {
        var numeri = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        Iterator<Integer> iterator = numeri.iterator();
        while (iterator.hasNext()) {
            Integer intero = iterator.next();
            if (intero % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numeri);
    }
}