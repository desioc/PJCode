public class Esercizio5_11 {
    public static void main(String args[]) {
        int [] ii = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] jj = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : ii) {
            for (int j : jj) {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
} 
/* // versione metodo main
void main() {
    int [] ii = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int [] jj = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int i : ii) {
        for (int j : jj) {
            System.out.print(i*j + "\t");
        }
        System.out.println();
    }
} */