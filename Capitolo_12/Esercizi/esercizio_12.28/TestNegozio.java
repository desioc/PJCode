// classe di test
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class TestNegozio {
    public static void main(String[] args) {
        Negozio negozio = new Negozio();
        
        // test metodo disponibile
        boolean esisteGiant = negozio.disponibile(b -> "Giant".equals(b.marca()));
        System.out.println("Esiste una Giant? " + esisteGiant);
        
        // test metodo primaDisponibile
        Optional<Bicicletta> primaEconomica = negozio.primaDisponibile(b -> b.prezzo() < 450);
        System.out.println("Prima bicicletta economica: " + primaEconomica.orElse(null));
        
        // test metodo getBiciclette
        List<Bicicletta> bicicletteCostose = negozio.getBiciclette(false);
        System.out.println("Biciclette costose: " + bicicletteCostose);
        
        // test metodo prezzoDiTutteLeBiciclette
        DoubleSummaryStatistics stats = negozio.prezzoDiTutteLeBiciclette();
        System.out.println("Statistiche prezzi: " + stats);
        
        // test metodo getBiciclettePerPrezzo
        Map<Double, List<Bicicletta>> biciclettePerPrezzo = negozio.getBiciclettePerPrezzo();
        System.out.println("Biciclette per prezzo: " + biciclettePerPrezzo);
    }
}