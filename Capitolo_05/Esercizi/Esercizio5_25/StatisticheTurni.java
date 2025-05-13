import java.time.DayOfWeek;

public class StatisticheTurni {

    public int numeroInizioSettimana;
    public int numeroCentroSettimana;
    public int numeroFineSettimana;
    public int numeroWeekend;
    
    public void stampaStatistiche(int numeroTurni) {
        GestioneTurni gestioneTurni = new GestioneTurni();
        // generazione di 100 valori casuali di DayOfWeek
        for (int i = 0; i < numeroTurni; i++) {
            DayOfWeek giorno = gestioneTurni.dammiGiornoDellaSettimana();

            switch (giorno) {
                case MONDAY -> numeroInizioSettimana++;
                case TUESDAY, WEDNESDAY, THURSDAY -> numeroCentroSettimana++;
                case FRIDAY -> numeroFineSettimana++;
                case SATURDAY, SUNDAY -> numeroWeekend++;
            }
        }
        // Stampa il report statistico
        System.out.println("REPORT STATISTICO DEI GIORNI DELLA SETTIMANA:");
        System.out.println("Inizio settimana: " + numeroInizioSettimana + " volte");
        System.out.println("Parte centrale settimana: " + numeroCentroSettimana + " volte");
        System.out.println("Fine settimana: " + numeroFineSettimana + " volte");
        System.out.println("Weekend: " + numeroWeekend + " volte");
    }
}