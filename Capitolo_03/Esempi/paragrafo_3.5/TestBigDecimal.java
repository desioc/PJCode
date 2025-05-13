import java.math.*;

public class TestBigDecimal {
    public static void main(String args[]) {

        BigDecimal numero1 = new BigDecimal("0.1");
        BigDecimal numero2 = new BigDecimal("0.2");
        BigDecimal somma = numero1.add(numero2);
        System.out.println("Somma = " + somma);

        somma = somma.setScale(10, RoundingMode.HALF_UP);
        System.out.println("Risultato della somma: " + somma);

        BigDecimal d = new BigDecimal(.1); // ".1" è equivalente a "0.1"
        System.out.println(d);


        BigDecimal bdDouble = BigDecimal.valueOf(0.2d);
        System.out.println(bdDouble); // stampa 0.2

        System.out.println(new BigDecimal(56)); // stampa 56
        BigDecimal bdLong = new BigDecimal(123456789012345L);
        System.out.println(bdLong); // stampa 123456789012345
        BigInteger bigInteger = BigInteger.valueOf(10);
        System.out.println(new BigDecimal(bigInteger)); // stampa 10
        BigDecimal bdLong2 = BigDecimal.valueOf(123456789012345L);
        System.out.println(bdLong2); // stampa 123456789012345
        BigDecimal bdLong3 = BigDecimal.valueOf(123456789012345L, 2);
        System.out.println(bdLong3); // stampa 1234567890123.45
        BigDecimal bdChars = new BigDecimal(new char[] {
            '9', '4'
        } );
        System.out.println(bdChars); // stampa 94        
    }
}