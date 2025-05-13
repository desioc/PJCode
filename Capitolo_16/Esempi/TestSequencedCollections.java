import java.util.*;
@jdk.internal.javac.PreviewFeature
public class TestSequencedCollections {
    public static void main(String args[]) {
        Set<String> cantautori = new LinkedHashSet<>();
        cantautori.add("Pino Daniele");
        cantautori.add("Lucio Dalla ");
        cantautori.add("Claudio Baglioni");
        System.out.println(((SequencedCollection<String>) cantautori).getFirst());
        System.out.println(((SequencedCollection<String>) cantautori).getLast());
        SequencedCollection<String> inversa =((SequencedCollection<String>) cantautori).reversed();
    }
}