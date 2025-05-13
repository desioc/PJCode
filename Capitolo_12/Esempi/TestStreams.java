import java.util.*;

public class TestStreams {
    public static void main(String args[]) {
        Collection<Smartphone> smartphones = new HashSet<>();
        smartphones.add(new Smartphone("Samsung" , "S99" , 1920));
        smartphones.add(new Smartphone("Apple" , "IPhone 55" , 2721));
        smartphones.add(new Smartphone("Motorola" , "Edge 90" , 300));
        smartphones.add(new Smartphone("Xiaomi" , "Redmi 80" , 700));
        smartphones.add(new Smartphone("Google" , "Pixel 94" , 925));
        smartphones.add(new Smartphone("Samsung" , "A88" , 610));
        smartphones.stream().filter(s->"Samsung".equals(s.getMarca())).forEach(s->System.out.println(s));
//        smartphones.parallelStream().filter(s->"Samsung".equals(s.getMarca())).forEach(s->System.out.println(s));
    }
}
