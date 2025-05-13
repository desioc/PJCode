public class Semaforo {
    public String stato;
 /* public enum Colore {
        VERDE, GIALLO, ROSSO; // resto del codice omesso
    } */
    public enum Colore {
        VERDE("verde"), GIALLO("giallo"), ROSSO("rosso"); 
        private String colore;                      // variabile d'istanza
        Colore(String colore) {                     // costruttore privato
            this.colore =  colore;
        }
        public void setColore(String colore) {      // metodo setter
            this.colore =  colore;
        }
        public String getColore() {                 // metodo getter
            return colore;
        }
        public String getDescrizione() {           // metodo d'istanza
            return "La luce è " + this.colore;
        }
    }
    public void cambiaColore(Colore colore) {      // metodo che cambia lo stato
        stato = colore.getDescrizione();
    }
    public void stampaColore() {                   // metodo d'istanza
        System.out.println(stato);
    }
}