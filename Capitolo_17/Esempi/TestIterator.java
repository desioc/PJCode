import java.util.ArrayList;
import java.util.List;

// interfaccia Iterator
interface Iteratore<T> {
    boolean hasNext();
    T next();
}

// la collezione su cui iterare
class Collezione<T> {
    private List<T> elementi = new ArrayList<>();

    public void aggiungi(T elemento) {
        elementi.add(elemento);
    }

    public Iteratore<T> creaIteratore() {
        return new IteratoreLista<>(elementi);
    }
}

// implementazione concreta di Iterator
class IteratoreLista<T> implements Iteratore<T> {
    private List<T> lista;
    private int posizione = 0;

    public IteratoreLista(List<T> lista) {
        this.lista = lista;
    }

    @Override
    public boolean hasNext() {
        return posizione < lista.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new IllegalStateException("Fine della collezione raggiunta");
        }
        return lista.get(posizione++);
    }
}

// metodo main
void main() {
    Collezione<String> collezione = new Collezione<>();
    collezione.aggiungi("Elemento 1");
    collezione.aggiungi("Elemento 2");
    collezione.aggiungi("Elemento 3");

    Iteratore<String> iteratore = collezione.creaIteratore();
    while (iteratore.hasNext()) {
        System.out.println(iteratore.next());
    }

}