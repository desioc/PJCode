public class Contenitore<T> {	// classe generica parametrizzata dal tipo T
    private T val;		// variabile di tipo T (tipo parametro)
    public Contenitore(T t) {	// costruttore che setta la variabile val
        val = t;
    }
    public T getVal() {		// metodo che restituisce l’oggetto val
        return val;
    }
    // omessi altri metodi
}
