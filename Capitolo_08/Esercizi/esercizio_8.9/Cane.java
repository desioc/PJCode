public class Cane extends Animale {
    public static final String TIPO = "cane";

    @Override
    public void verso() {
        System.out.println("Il cane abbaia.");
    }

    public static void info() {
        System.out.println("Questo è un cane.");
    }
}
