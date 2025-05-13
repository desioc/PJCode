import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

// flyweight astratto
interface Flyweight {
    void disegna(int x, int y);
}

// concrete flyweight
class TipoAlbero implements Flyweight {
    private String nome;
    private String colore;
    private String textureFoglie;

    public TipoAlbero(String nome, String colore, String textureFoglie) {
        this.nome = nome;
        this.colore = colore;
        this.textureFoglie = textureFoglie;
    }

    @Override
    public void disegna(int x, int y) {
        System.out.println("Disegno " + nome + " di colore " + colore + " a (" + x + "," + y + ")");
    }
}

// classe contenitore (Albero)
class Albero {
    private int x;
    private int y;
    private Flyweight tipo; // <-- uso l'interfaccia

    public Albero(int x, int y, Flyweight tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public void disegna() {
        tipo.disegna(x, y);
    }
}

// factory dei Flyweight
class TipoAlberoFactory {
    private static Map<String, TipoAlbero> tipi = new HashMap<>();

    public static TipoAlbero getTipoAlbero(String nome, String colore, String textureFoglie) {
        String key = nome + "-" + colore + "-" + textureFoglie;
        if (!tipi.containsKey(key)) {
            tipi.put(key, new TipoAlbero(nome, colore, textureFoglie));
        }
        return tipi.get(key);
    }
}

// foresta che usa gli alberi
class Foresta {
    private List<Albero> alberi = new ArrayList<>();

    public void piantaAlbero(int x, int y, String nome, String colore, String textureFoglie) {
        Flyweight tipo = TipoAlberoFactory.getTipoAlbero(nome, colore, textureFoglie);
        Albero albero = new Albero(x, y, tipo);
        alberi.add(albero);
    }

    public void disegna() {
        alberi.forEach(Albero::disegna);
    }
}

// classe del main
public class TestFlyweight {
    public static void main(String args[]) {
        Foresta foresta = new Foresta();
        foresta.piantaAlbero(10, 20, "Pino" , "Verde" , "Ruvida");
        foresta.piantaAlbero(30, 40, "Pino" , "Verde" , "Ruvida");
        foresta.piantaAlbero(50, 60, "Quercia" , "Marrone" , "Liscia");

        foresta.disegna();
    }
}