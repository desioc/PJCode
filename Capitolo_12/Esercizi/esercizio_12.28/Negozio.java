// classe Negozio
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Negozio {  
    private List<Bicicletta> biciclette;
    public Negozio (){
        biciclette = List.of(new Bicicletta("Bianchi", 400), 
                             new Bicicletta("Giant", 360), 
                             new Bicicletta("Scott ", 400),
                             new Bicicletta("Canyon ", 500),
                             new Bicicletta("Specialized", 500),
                             new Bicicletta("Trek ", 450)
                            );
    }
    
    public boolean disponibile(Predicate<Bicicletta> predicate) {
        // ritornare un booleano se almeno una delle biciclette soddisfa la condizione del Predicate
        return biciclette.stream().anyMatch(predicate);
    }
    
    public Optional<Bicicletta> primaDisponibile(Predicate<Bicicletta> predicate) {
        // ritornare in un Optional la prima bicicletta che soddisfa la condizione del Predicate
        return biciclette.stream().filter(predicate).findFirst();
    }
    
    public List<Bicicletta> getBiciclette(boolean economiche) {
        // ritornare una lista di biciclette che costano meno di 450 euro se il parametro economiche vale true
        // o ritornare una lista di biciclette che hanno un costo superiore o uguale a 450 euro 
        // se il parametro economiche vale false

        // versione con Collectors.toList:
        /* return biciclette.stream()
            .filter(b -> economiche ? b.prezzo < 450 : b.prezzo >= 450)
            .collect(Collectors.toList()); */
            
        // versione con partitiningBy:
         return biciclette.stream()
            .collect(Collectors.partitioningBy(b -> b.prezzo() < 450))
            .get(economiche);
    }
    
    public DoubleSummaryStatistics prezzoDiTutteLeBiciclette() {
        // ritornare tutte le informazioni sul prezzo di tutte le biciclette
        return biciclette.stream()
            .collect(Collectors.summarizingDouble(Bicicletta::prezzo));
    }
    
    public Map<Double, List<Bicicletta>> getBiciclettePerPrezzo() {
        // ritorna una mappa con prezzo come chiave e List<Bicicletta> come valore
        return biciclette.stream()
            .collect(Collectors.groupingBy(Bicicletta::prezzo));
    }    
    
}
