public class TestRettangolo {
    public static void main(String args[]) {
        var rettangolo1 = new Rettangolo(77, 11); // costruttore canonico
        System.out.println("rettangolo1: " + rettangolo1);
        var rettangolo2 = new Rettangolo(7 , -9, false); // costruttore non canonico
        System.out.println("rettangolo2: " + rettangolo2);
        Rettangolo rettangolo3 = null;
        try {
            rettangolo3 = new Rettangolo(0 , 10, true); // costruttore non canonico
        } catch (IllegalArgumentException exc) {
            System.out.println(exc.getMessage());
        }
        System.out.println("rettangolo3: " + rettangolo3);
    }
}