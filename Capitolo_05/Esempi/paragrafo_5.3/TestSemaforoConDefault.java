public class TestSemaforoConDefault {
    public static void main(String args[]) {
        SemaforoConDefault semaforo = new SemaforoConDefault();
        semaforo.cambiaColore(ColoreConNero.ROSSO);
        semaforo.stampaStato();
        semaforo.cambiaColore(ColoreConNero.GIALLO);
        semaforo.stampaStato();
        semaforo.cambiaColore(ColoreConNero.VERDE);  
        semaforo.stampaStato();
        semaforo.cambiaColore(ColoreConNero.NERO);
        semaforo.stampaStato();
    }
}
