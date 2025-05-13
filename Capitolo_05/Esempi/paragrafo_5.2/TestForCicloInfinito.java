public class TestForCicloInfinito {
    public static void main(String args[]) { // ATTENZIONE STOPPARE IL PROCESSO PER INTERROMPERE IL CICLO INFINITO
        for (;true;) { // oppure for (;;) {
            // ...
        }
        //for (;false;) { } non compilabile
    }
}