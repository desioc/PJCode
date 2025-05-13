public class TestAnimali {
    public static void main(String[] args) {
        Animale a = new Animale();
        Cane c = new Cane();
        Animale ac = new Cane(); // polimorfismo

        System.out.println("Animale.TIPO: " + Animale.TIPO);
        System.out.println("Cane.TIPO: " + Cane.TIPO);
        System.out.println("ac.TIPO: " + ac.TIPO); // hiding: fa riferimento alla variabile statica della classe di riferimento statico

        System.out.println();

        a.verso(); // L'animale fa un verso.
        c.verso(); // Il cane abbaia.
        ac.verso(); // Il cane abbaia. (override dinamico)

        System.out.println();

        Animale.info(); // Questo è un animale.
        Cane.info();    // Questo è un cane.
        ac.info();      // Questo è un animale. (hiding: metodo statico chiamato in base al tipo statico della reference)
    }
}
