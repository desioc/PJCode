import java.io.Serializable;

public class CassaforteSer implements Serializable {
    private final String marca;
    private final String modello;
    private transient int combinazione;

    public CassaforteSer(String marca, String modello, int combinazione) {
        this.marca = marca;
        this.modello = modello;
        this.combinazione = combinazione;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getCombinazione() {
        return combinazione;
    }

    @Override
    public String toString() {
        return "CassaforteSer[marca=" + marca + ", modello=" + modello + ", combinazione=" + combinazione + "]";
    }
}
