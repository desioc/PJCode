public enum Colore {
    VERDE("verde"), GIALLO("giallo"), ROSSO("rosso"); 
    private String colore;                 // variabile d'istanza
    Colore(String colore) {                // costruttore privato
        this.colore =  colore;
    }
    public void setColore(String colore) { // metodo setter
        this.colore =  colore;
    }
    public String getColore() {            // metodo getter
        return colore;
    }
    public String getDescrizione() {       // metodo d'istanza
            return "La luce è " + this.colore;
    }
}