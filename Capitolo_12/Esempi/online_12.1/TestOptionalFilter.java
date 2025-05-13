import java.util.Optional;

public class TestOptionalFilter {
  public static void main(String[] args) {
    Optional<Integer> numero = Optional.of(10);

    // Usiamo filter per verificare se il numero è pari
    Optional<Integer> numeroPari = numero.filter(n -> n % 2 == 0);

    System.out.println(numeroPari.isPresent() ? 
        "Numero pari: " + numeroPari.get() : "Nessun valore presente");

    // Esempio con valore che non soddisfa il filtro
    Optional<Integer> numeroDispari = numero.filter(n -> n % 2 != 0);
    System.out.println(numeroDispari.isPresent() ? 
        "Numero dispari: " + numeroDispari.get() : "Nessun valore presente");
  }
}