import java.time.DayOfWeek;
import java.util.HashMap;

public class StatisticheTurni {

    public HashMap<DayOfWeek, Integer> giorniDellaSettimana;
    public DayOfWeek giorni[];
    
    public StatisticheTurni () {
        giorniDellaSettimana = new HashMap<>();
        // per semplificare l'inizializzazione della mappa 
        // usiamo il metodo values delle enumerazioni che 
        // restituisce i valori dell'enumerazione in un array.
        giorni = DayOfWeek.values();
        for(var giorno : giorni) {
            giorniDellaSettimana.put(giorno, 0);
        }
    }

    public void stampaStatistiche(int numeroTurni) {
        GestioneTurni gestioneTurni = new GestioneTurni();
        // generazione di 100 valori casuali di DayOfWeek
        for (int i = 0; i < numeroTurni; i++) {
            DayOfWeek giornoCasuale = gestioneTurni.dammiGiornoDellaSettimana();
            giorniDellaSettimana.put(giornoCasuale, giorniDellaSettimana.get(giornoCasuale) + 1);
        }
        // Stampa il report statistico
        System.out.println("REPORT STATISTICO DEI GIORNI DELLA SETTIMANA:");
        for (var giorno : giorni) {
            System.out.println(giorno + ": " + giorniDellaSettimana.get(giorno) + " volte");
        }

    }
}