import java.util.ArrayList;

public class DeMorgan {
    public static void main(String args[]) {
        var list = new ArrayList<Integer>();
        int i = 1;
        while (i < 11) {
            //if (i != 5 && i != 7 && i != 9) {
            if (!(i == 5 || i == 7 || i == 9)) {
                list.add(i);
            }
            i++;
        }
        System.out.println(list);
    }
}

// versione con metodo main
/* void main() {
    var list = new ArrayList<Integer>();
    int i = 1;
    while (i < 11) {
            //if (i != 5 && i != 7 && i != 9) {
        if (!(i == 5 || i == 7 || i == 9)) {
            list.add(i);
        }
        i++;
    }
    System.out.println(list);
} */