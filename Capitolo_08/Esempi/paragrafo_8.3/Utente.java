import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public record Utente(String nome, List<String> interessi) {
    public Utente {                        // costruttore canonico compatto
        Objects.requireNonNull(nome);      // requireNonNull lancia una eccezione
        Objects.requireNonNull(interessi); // se il parametro è null   
        interessi = List.copyOf(interessi);
        this.nome = nome;
    }

    public List<String> interessi() {          // definizione esplicita del metodo
        return new ArrayList<>(interessi); // getter che restituisce una copia
    }    
}