import java.util.stream.*;
import java.util.*;

public class TestPartitioningBy {
    public static void main(String args[]) {
        Collection<Smartphone> smartphones = getSmartphones();
        Map<Boolean, List<Smartphone>> partizionati = smartphones.stream()
            .collect(Collectors.partitioningBy(s -> s.getPrezzo() < 1000));

        // Stampiamo i gruppi
        System.out.println("Smartphone economici:");
        partizionati.get(true).forEach(System.out::println);

        System.out.println("\nSmartphone costosi:");
        partizionati.get(false).forEach(System.out::println);
    }
    public static Collection<Smartphone> getSmartphones() {
        Collection<Smartphone> smartphones = new HashSet<>();
        smartphones.add(new Smartphone("Samsung","Note 74", 1620));
        smartphones.add(new Smartphone("Apple","Iphone 55",2721));
        smartphones.add(new Smartphone("Motorola","G55",1700));
        smartphones.add(new Smartphone("Samsung","S 99", 700));
        smartphones.add(new Smartphone("Samsung","J46", 925));
        smartphones.add(new Smartphone("Samsung","A27", 610));
        return smartphones;
    }
}