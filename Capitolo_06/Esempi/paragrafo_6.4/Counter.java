public class Counter {
    private static int counter = 0; // inizializzazione non necessaria
    private int number;
    public Counter() {
        counter++;
        setNumber(counter);
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
}
