import java.util.*;
import java.util.stream.*;

public class TestCollectors {
    public static void main(String args[]) {
        Collection<Smartphone> smartphones = getSmartphones();
        // List<String> modelli = smartphones.stream().map(Smartphone::getModello).toList(); // (da java 16)
        List<String> modelli = smartphones.stream().map(Smartphone::getModello).collect(Collectors.toList());
        modelli.remove(0);
        modelli.forEach(System.out::println);
        System.out.println();
        //Set<String> marche = smartphones.stream().map(Smartphone::getMarca).collect(Collectors.toCollection(TreeSet::new));
        Set<String> marche = smartphones.stream().map(Smartphone::getMarca).collect(Collectors.toSet());
        marche.forEach(System.out::println);
        String modelliConSeparatore = smartphones.stream().map(Smartphone::toString).collect(Collectors.joining("; "));
        System.out.println(modelliConSeparatore);
        System.out.println();
        Map<Boolean, List<Smartphone>> partizionati = smartphones.stream()
            .collect(Collectors.partitioningBy(s -> s.getPrezzo() < 1000));
        System.out.println("Smartphone economici:");
        partizionati.get(true).forEach(System.out::println);
        System.out.println("\nSmartphone costosi:");
        partizionati.get(false).forEach(System.out::println);
        System.out.println();
        Map<String, List<Smartphone>> map = smartphones.stream().collect(Collectors.groupingBy(Smartphone::getMarca));
        System.out.println(map);

        DoubleSummaryStatistics stats = smartphones.stream().collect(Collectors.summarizingDouble(Smartphone::getPrezzo));
        System.out.println(stats);
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