import java.util.*;

public class PariODispari {
    public String dammiPariODispari() {
        Random random = new Random();
        return random.nextInt() % 2 == 0 ? "Pari" : "Dispari";
//         return random.nextBoolean() ? "Pari" : "Dispari";   // anche questa è una soluzione
    }
}