import java.util.*;

public class TestSimpleOptional {
    
    public static String getTitoloMaiuscolo(String titolo) {
        if (titolo != null) {
            return  titolo.toUpperCase();
        }
        return "NESSUN TITOLO" ;
    }

    
    public static String getTitoloMaiuscoloOpt(String titolo) {
        Optional<String> opt = Optional.ofNullable(titolo);
//        return opt.orElse("nessun titolo").toUpperCase();
//        return opt.orElseGet(() ->"nessun titolo").toUpperCase();
        return opt.orElseThrow(IllegalArgumentException::new).toUpperCase();
    }

    public static boolean isTitoloJava(Libro o) {
        return Optional.ofNullable(o)
            .map(Libro::titolo)
            .filter(t -> t.contains("Java"))
            .isPresent();
    }

    public static Optional<String> getTitoloOpt(Libro o) {
        return Optional.ofNullable(o.titolo());
    }

    public static boolean isTitoloJavaFM(Libro o) {
        return Optional.ofNullable(o)
            .flatMap(TestSimpleOptional::getTitoloOpt)
            .filter(t -> t.contains("Java"))
            .isPresent();
    }


    public static void main(String args[]) {
//        System.out.println(getTitoloMaiuscolo("titolo"));
//        System.out.println(getTitoloMaiuscolo(null));

//        System.out.println(getTitoloMaiuscoloOpt("titolo"));
//        System.out.println(getTitoloMaiuscoloOpt(null)); //lancia l'eccezione

//        Libro o = new Libro("Programmazione Java");
//        System.out.println(isTitoloJava(o));
//        o = new Libro("SQL");
//        System.out.println(isTitoloJava(o));
//        o = new Libro("null");
//        System.out.println(isTitoloJava(o));
//        o = null;
//        System.out.println(isTitoloJava(o));

        Libro o = new Libro("Programmazione Java");
        System.out.println(isTitoloJavaFM(o));
        o = new Libro("SQL");
        System.out.println(isTitoloJavaFM(o));
        o = new Libro("null");
        System.out.println(isTitoloJavaFM(o));
        o = null;
        System.out.println(isTitoloJavaFM(o)); 
    }
}