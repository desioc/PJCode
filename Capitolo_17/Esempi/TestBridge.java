// interfaccia implementor
interface DispositivoDisegno {
    void disegnaCerchio(int x, int y, int raggio);
}

// prima implementazione con ruolo concrete implementor
class DispositivoDisegnoVettoriale implements DispositivoDisegno {
    @Override
    public void disegnaCerchio(int x, int y, int raggio) {
        println("Disegno un cerchio vettoriale di raggio " + raggio 
            + " alle coordinate (" + x + "," + y + ")");
    }
}

// seconda implementazione con ruolo concrete implementor
class DispositivoDisegnoRaster implements DispositivoDisegno {
    @Override
    public void disegnaCerchio(int x, int y, int raggio) {
        println("Disegno un cerchio raster di raggio " + raggio 
            + " alle coordinate (" + x + "," + y + ")");
    }
}

// classe di ruolo abstraction
public abstract class Forma {
    protected DispositivoDisegno dispositivo;

    protected Forma(DispositivoDisegno dispositivo) {
        this.dispositivo = dispositivo;
    }

    public abstract void disegna();
}

// classe con ruolo RefinedAbstraction
public class Cerchio extends Forma {
    private int x, y, raggio;

    public Cerchio(int x, int y, int raggio, DispositivoDisegno dispositivo) {
        super(dispositivo);
        this.x = x;
        this.y = y;
        this.raggio = raggio;
    }

    @Override
    public void disegna() {
        dispositivo.disegnaCerchio(x, y, raggio);
    }
}

// metodo main:
void main() {
    Forma cerchioVettoriale = 
        new Cerchio(10, 20, 5, new DispositivoDisegnoVettoriale());
    Forma cerchioRaster = 
        new Cerchio(15, 30, 10, new DispositivoDisegnoRaster());
    cerchioVettoriale.disegna();        
    cerchioRaster.disegna();
}
