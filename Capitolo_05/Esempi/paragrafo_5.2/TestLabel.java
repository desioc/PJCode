public class TestLabel {
    public static void main(String args[]) {
        int j = 1;
        pippo: //possiamo dare un qualsiasi nome a una label
        while (true) {
            while (true) {
                if (j > 10)
                    break pippo;
                System.out.println(j);
                j++;
            }
        }
    }
}