import java.util.*;

// definizione della classe che definisce un object pool (semplificata)
class ObjectPool {
    private final Queue<ObjectPooled> disponibili = new LinkedList<>();
    private int contatore = 0;
    private final int maxDimensione;

    public ObjectPool(int maxDimensione) {
        this.maxDimensione = maxDimensione;
    }

    public ObjectPooled prendi() {
        if (!disponibili.isEmpty()) {
            return disponibili.poll();
        }
        if (contatore < maxDimensione) {
            return new ObjectPooled(++contatore);
        }
        throw new RuntimeException("Nessun oggetto disponibile nel pool");
    }

    public void restituisci(ObjectPooled oggetto) {
        disponibili.offer(oggetto);
    }
}

// oggetto da inserire nella pool
class ObjectPooled {
    private final int id;

    public ObjectPooled(int id) {
        this.id = id;
    }

    public void eseguiOperazione() {
        System.out.println("Oggetto " + id + " in uso");
    }
}

// classe del main
public class TestObjectPool {
    public static void main(String[] args) {
        ObjectPool pool = new ObjectPool(2);

        ObjectPooled a = pool.prendi();
        a.eseguiOperazione();

        ObjectPooled b = pool.prendi();
        b.eseguiOperazione();

        pool.restituisci(a);

        ObjectPooled c = pool.prendi(); // riutilizza 'a'
        c.eseguiOperazione();
    }
}