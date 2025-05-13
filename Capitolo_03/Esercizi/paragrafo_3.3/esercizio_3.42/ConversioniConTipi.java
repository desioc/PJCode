public class ConversioniConTipi {
    public static void main(String args[]) {
        char d = (char)100;
        float f = (float)d*1_000_000_000;
        System.out.println((long)f);
    }
}
