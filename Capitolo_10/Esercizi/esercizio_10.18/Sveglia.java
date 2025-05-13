import java.util.Timer;
import java.util.TimerTask;

public class Sveglia {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Utilizzo: java Sveglia <secondi>");
            return;
        }

        int secondi;
        try {
            secondi = Integer.parseInt(args[0]);
            if (secondi <= 0) throw new NumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Inserire un numero intero positivo.");
            return;
        }

        System.out.println("Sveglia impostata tra " + secondi + " secondi...");

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("DRIIIIN! Sveglia!");
                timer.cancel(); // Ferma il timer dopo l'esecuzione
            }
        }, secondi * 1000L);
    }
}
