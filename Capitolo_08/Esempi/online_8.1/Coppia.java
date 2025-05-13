// classe generica che rappresenta una coppia di valori di tipo T e U
public class Coppia<T, U> {
    private T primo;
    private U secondo;

    // costruttore
    public Coppia(T primo, U secondo) {
        this.primo = primo;
        this.secondo = secondo;
    }

    // Mmtodo toString per visualizzare la coppia
    @Override
    public String toString() {
        return "(" + primo + ", " + secondo + ")";
    }

    public static void main(String[] args) {
        // creazione di una coppia di valori intero-stringa
        Coppia<Integer, String> coppia1 = new Coppia<>(1, "Uno");
        System.out.println("Coppia 1: " + coppia1);

        // creazione di una coppia di valori double-booleano
        Coppia<Double, Boolean> coppia2 = new Coppia<>(3.14, true);
        System.out.println("Coppia 2: " + coppia2);
    }
}