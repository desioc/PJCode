public class Contenitore<T> {	// classe generica parametrizzata dal tipo T
    private T val;		// variabile di tipo parametro T
    public Contenitore(T t) {	// costruttore che setta la varabile val
        val = t;
    }
    public T getVal() {		// metodo che restituisce l’oggetto val
        return val;
    }
    // omessi altri metodi
}