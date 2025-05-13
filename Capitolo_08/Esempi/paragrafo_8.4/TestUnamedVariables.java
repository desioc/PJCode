import java.util.Queue;
import java.util.LinkedList;

public class TestUnamedVariables {
    public static void main(String args[]) {
        // Caso 1: ciclo foreach
        int numeroArgs = 0;
        for (String _ : args) { // non ci interessa il valore dell'argomento
            numeroArgs++;
        }
        // Caso 2: ciclo for
        for (int i = 0, _ = startTime(); i < 10; i++) { // startTime ritorna un intero
            // codice omesso
        }
// Caso 3: assegnazione semplice
        Queue<Integer> ints = getQueue(); // getQueue ritorna una LinkedList di interi 
        while (ints.size() >= 2) {
            var x = ints.remove();          // il metodo remove ritorna l'elemento rimosso
            var _ = ints.remove();          // ci interessano solo le ascisse
            aggiungiAscissa(x);
        }
    }

    public static Queue<Integer> getQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(29);
        queue.add(7);
        queue.add(14);
        queue.add(4);
        queue.add(12);
        queue.add(11);
        return queue;
    }

    public static void aggiungiAscissa(Integer ascissa) {
        // codice omesso
    }

    public static int startTime() {
        // codice omesso
        return 1;
    }
}