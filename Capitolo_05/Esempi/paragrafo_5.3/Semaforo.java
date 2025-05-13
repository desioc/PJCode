public class Semaforo {
    public String stato;
    public void cambiaColore(Colore colore) {
        stato = switch(colore) {
            case VERDE  -> "La luce è verde";
            case GIALLO -> "La luce è gialla";
//          case ROSSO  -> "La luce è rossa";    
        };
    }
}
