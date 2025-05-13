import java.util.Arrays;
import java.util.Comparator;

public class TestComparators {

    static String nomi[] = {"Clarissa","Jem","Top","Ermeringildo","Iamaca",
                            "Tom","Arlequin","Francesca","Cumbus","Blue"};

    static int compareLunghezza(String first, String second) {
        return -(Integer.compare(first.length(), second.length()));
    }

    static int compareLunghezzaAlContrario(String first, String second) {
        return (Integer.compare(first.length(), second.length()));
    }

    static int compareAlfabetico (String first, String second) {
        return first.compareTo(second);
    }

    static int compareAlfabeticoAlContrario(String first, String second) {
        return -(first.compareTo(second));
    }

    static int compareLunghezzaEAlfabetico(String first, String second) {
        int result = -Integer.compare(first.length(),
        second.length());
        if (result == 0) {
            result = first.compareTo(second);
        }
        return result;
    }

    public static void main(String args[]) {
       
        Arrays.sort(nomi, TestComparators::compareLunghezza);
        System.out.println("Nomi ordinati per lunghezza: "
          + Arrays.asList(nomi));

        Arrays.sort(nomi, TestComparators::compareLunghezzaAlContrario);
        System.out.println("Nomi ordinati per lunghezza al contrario: " 
          + Arrays.asList(nomi));

        Arrays.sort(nomi, TestComparators::compareAlfabetico);
        System.out.println("Nomi ordinati : " + Arrays.asList(nomi));

        Arrays.sort(nomi, TestComparators::compareAlfabeticoAlContrario);
        System.out.println("Nomi ordinati al contrario: " 
          + Arrays.asList(nomi));

        Arrays.sort(nomi, TestComparators::compareLunghezzaEAlfabetico);
        System.out.println(
          "Nomi ordinati per lunghezza e in ordine alfabetico: "
          + Arrays.asList(nomi));
    }
}