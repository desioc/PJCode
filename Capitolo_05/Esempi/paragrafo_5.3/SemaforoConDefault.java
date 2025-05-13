public class SemaforoConDefault {
    public String stato;
    public void cambiaColore(ColoreConNero colore) {
        stato = switch(colore) {
            case VERDE  -> "La luce è verde";
            case GIALLO -> "La luce è gialla";
            case ROSSO  -> "La luce è rossa";   
            default -> "Caso imprevisto";
        };
    }
    
    public void stampaStato() {
        System.out.println(stato);
    }
}
