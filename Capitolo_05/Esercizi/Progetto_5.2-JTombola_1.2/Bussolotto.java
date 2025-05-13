import java.util.ArrayList;
import java.util.Random;

public class Bussolotto {
    public ArrayList<Integer> numeri;
    public Random random;
    public Bussolotto (){
        random =  new Random();
        numeri = new ArrayList<>(90); // il costruttore pu� settare la capacit� iniziale dell'array list
        for (int i = 1; i <= 90; i++) {
           numeri.add(i);
        }
    }

    public int estraiNumero() {
        int numeroCasuale = random.nextInt(numeri.size());
        int numeroEstratto = numeri.get(numeroCasuale);
        numeri.remove(numeroCasuale); // rimuoviamo il numero dal bussolotto
        return numeroEstratto;
    }
}