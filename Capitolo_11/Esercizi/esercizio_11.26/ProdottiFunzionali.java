// classe ProdottiFunzionali
import java.util.*;
import java.util.function.*;


public class ProdottiFunzionali {
    public static void main(String[] args) {
        // 1. creare una lista di prodotti
        List<Prodotto> prodotti = new ArrayList<>();
        prodotti.add(new Prodotto("Laptop", 1200.0, 5));
        prodotti.add(new Prodotto("Mouse", 25.0, 0));
        prodotti.add(new Prodotto("Tastiera", 45.0, 2));

        // 2. Predicate per verificare se un prodotto è esaurito
        Predicate<Prodotto> esaurito = p -> p.quantita() == 0;

        System.out.println("Prodotti esauriti:");
        prodotti.stream()
                .filter(esaurito)
                .forEach(p -> System.out.println(p.nome()));

        // 3. Supplier per creare un prodotto generico
        Supplier<Prodotto> prodottoGenerico = () -> new Prodotto("Prodotto generico", 10.0, 10);
        prodotti.add(prodottoGenerico.get());

        // 4. Consumer per applicare uno sconto del 10% a un prodotto
        Consumer<Prodotto> sconta = p -> {
            double scontato = p.prezzo() * 0.9;
            // per modificare il prodotto, ne creiamo uno nuovo e lo sostituiamo nella lista
            int index = prodotti.indexOf(p);
            prodotti.set(index, new Prodotto(p.nome(), scontato, p.quantita()));
        };
        prodotti.forEach(sconta);

        // 5. Function per generare una descrizione leggibile
        Function<Prodotto, String> descrizione = p ->
            "Prodotto: " + p.nome() + ", Prezzo: " + String.format("%.2f", p.prezzo()) + "€";

        System.out.println("\nDescrizioni dei prodotti scontati:");
        prodotti.stream()
                .map(descrizione)
                .forEach(System.out::println);
    }
}
