import java.util.ArrayList;

public class NumeriPari {
    public static void main(String args[]) {
        var numeriPari = new ArrayList<Integer>();
        int i = 1;
        while (i < 11) {
            if (i % 2 == 0) {
                numeriPari.add(i);
            }
            ++i;
        }
        System.out.println(numeriPari);
    }
}
//versione con metodo main
/* void main() {
    var numeriPari = new ArrayList<Integer>();
    int i = 1;
    while (i < 11) {
        if (i % 2 == 0) {
            numeriPari.add(i);
        }
        ++i;
    }
    System.out.println(numeriPari);
} */