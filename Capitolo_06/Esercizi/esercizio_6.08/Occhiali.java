public class Occhiali {
    private String modello;
    private String marca;
    private String correzione;

    public Occhiali (String modello, String marca, String correzione) {
        this.modello = modello;
        this.marca = marca;
        this.correzione = correzione;
    }
    
    public void setCorrezione(String correzione) {
        this.correzione = correzione;
    }

    public String getCorrezione() {
        return correzione;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }


    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getModello() {
        return modello;
    }

    public String toString() {
        return marca + " " + modello + " " + correzione;
    }
    

}