import java.util.ArrayList;
import java.util.List;

// astrazione di una forma grafica
interface FormaGrafica {
    void disegna();
}

// classe foglia (Cerchio)

class Cerchio implements FormaGrafica {
    private int x, y, raggio;

    public Cerchio(int x, int y, int raggio) {
        this.x = x;
        this.y = y;
        this.raggio = raggio;
    }

    @Override
    public void disegna() {
        println("Disegno un cerchio di raggio " + raggio
            + " alle coordinate (" + x + "," + y + ")");
    }
}

// classe foglia (Rettangolo)
class Rettangolo implements FormaGrafica {
    private int x, y, larghezza, altezza;

    public Rettangolo(int x, int y, int larghezza, int altezza) {
        this.x = x;
        this.y = y;
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    @Override
    public void disegna() {
        println("Disegno un rettangolo di dimensioni " 
            + larghezza + "x" + altezza + " alle coordinate (" + x + "," + y + ")");
    }
}

// classe composta (GruppoDiForme)
public class GruppoDiForme implements FormaGrafica {
    private List<FormaGrafica> forme = new ArrayList<>();

    public void aggiungi(FormaGrafica forma) {
        forme.add(forma);
    }

    @Override
    public void disegna() {
        println("Disegno il gruppo, ovvero:");
        for (FormaGrafica forma : forme) {
            forma.disegna();
        }
    }
}

// metodo main
void main() {
    FormaGrafica cerchio = new Cerchio(10, 20, 5);
    FormaGrafica rettangolo = new Rettangolo(30, 40, 10, 20);

    GruppoDiForme gruppo = new GruppoDiForme();
    gruppo.aggiungi(cerchio);
    gruppo.aggiungi(rettangolo);

    gruppo.disegna(); // disegnerà sia il cerchio che il rettangolo
}