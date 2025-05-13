import java.time.DayOfWeek;
import java.util.Random;

public class GestioneTurni {    
    public final Random random;
    public final DayOfWeek giorni[];
    
    public GestioneTurni() {
        giorni = DayOfWeek.values();
        random = new Random();
    }
    
    public DayOfWeek dammiGiornoDellaSettimana() {
        int numero = random.nextInt(7);
        return giorni[numero];   
     }
}