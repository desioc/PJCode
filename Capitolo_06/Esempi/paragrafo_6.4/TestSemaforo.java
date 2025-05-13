public class TestSemaforo {
    public static void main(String args[]) {
        Semaforo semaforo = new Semaforo();
        semaforo.cambiaColore(Semaforo.Colore.VERDE);
        semaforo.stampaColore();
    }
}