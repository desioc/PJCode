public class SemaforoConDefault {
    public String stato;
    public void cambiaColore(ColoreConNero colore) {
        stato = switch(colore) {
            case VERDE  -> "La luce � verde";
            case GIALLO -> "La luce � gialla";
            case ROSSO  -> "La luce � rossa";   
            default -> "Caso imprevisto";
        };
    }
    
    public void stampaStato() {
        System.out.println(stato);
    }
}
