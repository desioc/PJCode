import java.util.*;

public class TestPipeline {
    public static void main(String args[]) {
        Collection<Smartphone> smartphones = getSmartphones();
        double prezzoTotale = 0;
        /* System.out.println(int numeroSamsung = 0;
        for (Smartphone smartphone : smartphones) {
            if (smartphone.getMarca().equals("Samsung")) {
                numeroSamsung++;
                prezzoTotale += smartphone.getPrezzo();
            }
        }
        double average = prezzoTotale/numeroSamsung;); */

        double average = smartphones
            .stream()
            .filter(s -> s.getMarca().equals("Samsung"))
            .mapToDouble(Smartphone::getPrezzo)
            .average()
            .getAsDouble(); 
        System.out.println(average);
    }

    public static Collection<Smartphone> getSmartphones() {
        Collection<Smartphone> smartphones = new HashSet<>();
        smartphones.add(new Smartphone("Samsung" , "S99" , 1920));
        smartphones.add(new Smartphone("Apple" , "IPhone 55" , 2721));
        smartphones.add(new Smartphone("Motorola" , "Edge 90" , 300));
        smartphones.add(new Smartphone("Xiaomi" , "Redmi 80" , 700));
        smartphones.add(new Smartphone("Google" , "Pixel 94" , 925));
        smartphones.add(new Smartphone("Samsung" , "A88" , 610));
        return smartphones;
    }
}