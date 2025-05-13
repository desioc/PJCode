import java.util.*;

public class Garage {
    public ArrayList<Auto> auto;
    
    public Garage() {
        auto = new ArrayList<>();
    }
    
    public void permettiAccesso(Auto veicolo) {
        auto.add(veicolo);
    }
    
    public void permettiUscita(Auto veicolo) {
        auto.remove(veicolo);
    }
}