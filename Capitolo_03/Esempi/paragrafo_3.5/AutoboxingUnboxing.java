public class AutoboxingUnboxing {
    public static void main(String args[]) {
        Integer integer = 1;
        Double d = 3.0D;
        Boolean booleano = true;
        char c = new Character('c');
        byte b = new Byte((byte)1);
        int i = 29;
        Short s = new Short ((short)7);
        Float f = 74.0F;
        double d2 = i * f - s;
        //Double d = 2; //non compila bisogna aggiungere una D finale
        //d = 2D;

        Integer ii = Integer.valueOf(22); // i vale 22
        int j = i++; // j vale 22, i vale 23
        Integer k = (Byte.valueOf((byte)10) + j); // k vale 32
        int t = k + j + ii; // t vale 32 + 22 + 23 = 77

        //int i = 1;
        //Integer integer = new Integer(2);
        //int somma = i + integer;
        //Integer somma = i + integer;

    }
}