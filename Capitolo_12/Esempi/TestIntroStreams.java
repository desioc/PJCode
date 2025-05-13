import java.util.*;
import java.util.stream.Stream;

public class TestIntroStreams {
    public static void main(String args[]) {
        Collection<Smartphone> smartphones = getSmartphones();
        for (Smartphone s : smartphones) {
            if ("Samsung" .equals(s.getMarca())) {
                System.out.println(s);
            }
        }

        smartphones.stream()
            .filter(s-> "Samsung" .equals(s.getMarca())) // filtra gli elementi
            .forEach(s->System.out.println(s));        // stampa gli elementi filtrati
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