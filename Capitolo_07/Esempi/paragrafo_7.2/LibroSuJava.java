public class LibroSuJava extends Libro {
    public LibroSuJava(String titolo) {
        super(titolo);
    }

    public LibroSuJava(String titolo, String autore) {
        super(titolo, autore);
    }
    //...
}

/* prima versione

public class LibroSuJava extends Libro {
    public LibroSuJava() {
        System.out.println("Costruito un Libro su Java!");
    }
}

*/