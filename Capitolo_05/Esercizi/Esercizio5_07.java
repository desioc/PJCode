public class Esercizio5_07 {
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