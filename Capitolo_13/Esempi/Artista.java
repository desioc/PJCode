import java.io.Serializable;

public record Artista(String nome, String cognome, int eta) implements Serializable {
    public Artista { // costruttore canonico in forma compatta
        if (eta < 0) {
            throw new IllegalArgumentException("L'età non può essere negativa");
        }
    }
}
