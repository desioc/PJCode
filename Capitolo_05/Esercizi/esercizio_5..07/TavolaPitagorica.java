public class TavolaPitagorica {
    public static void main(String args[]) {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.print(i*j + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
// versione con metodo main
/* void main() {
    int i = 1;
    while (i <= 10) {
        int j = 1;
        while (j <= 10) {
            System.out.print(i*j + "\t");
            j++;
        }
        System.out.println();
        i++;
    }
} */