import java.util.Optional;

public class TestIsTitoloJava {
    public static void main(String args[]) {
        Libro o = new Libro("Programmazione Java");
        System.out.println(isTitoloJava(o));
        o = new Libro("SQL");
        System.out.println(isTitoloJava(o));
        o = new Libro(null);
        System.out.println(isTitoloJava(o));
        o = null;
        System.out.println(isTitoloJava(o));

    }
    public static boolean isTitoloJava(Libro o) {
        return Optional.ofNullable(o) // otteniamo un optional 
            .map(Libro::titolo) // mappiamo il valore con il metodo titolo
            .filter(t -> t.contains("Java")) // filtriamo Optional potenzialmente vuoto
            .isPresent(); // restituisce un booleano in base al contenuto dell’Optional
    }

}