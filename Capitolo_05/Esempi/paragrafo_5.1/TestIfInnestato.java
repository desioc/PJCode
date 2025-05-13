public class TestIfInnestato {
    public static void main(String args[]) {
        boolean faMoltoCaldo = true;
        String stagione = "primavera" ;
        // if innestato
        if (faMoltoCaldo) {
            if (!stagione.equals("estate")) {
                System.out.println("Questo caldo è anomalo.");
            } else {
                System.out.println("Questo caldo è normale in estate.");
            }
        } else {
            System.out.println("Non fa particolarmente caldo.");
        }
        // versione compatta
        if (faMoltoCaldo)
            if (!stagione.equals("estate")) System.out.println("Questo caldo è anomalo.");
            else System.out.println("Questo caldo è normale in estate.");
        else System.out.println("Non fa particolarmente caldo."); 
        // versione che si evolve
        if (faMoltoCaldo)
            if (!stagione.equals("estate")) System.out.println("Questo caldo è anomalo.");
            else {
                System.out.println("Questo caldo è normale in estate.");
                System.out.println("Il tg dice di bere molto...");
            }
        else System.out.println("Non fa particolarmente caldo.");

    }
}