public class OperatoriDAssegnazioneEAritmetici {
    public static void main(String args[]) {
        int variabile1 = 0;
        variabile1 = 1;
        int variabile2 = 2;
        variabile1 = variabile2;

        int i = -1;
        int j = +1;

        int negativeZero = -0;
        int positiveZero = +0;

        i = 5;
        i = i + 2;
        i += 2;
        i += 2;
        i = (i + 2);

        byte b = 0;
        b += 8;
        b = (byte)(b+8);

        b = 127;
        b += 1;
        System.out.println(b);

        i = i + 1;
        i += 1;
        i++;
        ++i;

        int x = 5;
        int y = ++x; // risultato: x = 6 e y = 6
        x = 5;
        y = x++; // risultato: x = 6 e y = 5

        b = 1;
        b++; //equivalente a b += 1 che è equivalente a b = (byte)(b+1)
    }
}