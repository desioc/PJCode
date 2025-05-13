public class TestClasseInnestata {
    public static void main(String args[]) {
        Auto miaAuto = new Auto("Nissan");
        Auto.Motore motore = miaAuto.new Motore(1500);
        motore.accendi(); // Output: Il motore della Nissan è acceso.
    }
}