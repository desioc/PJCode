import java.math.*;

public class TestBigInteger {
    public static void main(String args[]) {
        BigInteger numero1 = new BigInteger("123456789012345678901234567890");
        BigInteger numero2 = new BigInteger("987654321098765432109876543210");
        BigInteger prodotto = numero1.multiply(numero2);
        System.out.println("Prodotto = " + prodotto);

        BigInteger base = new BigInteger("2");
        BigInteger esponente = new BigInteger("10");
        BigInteger risultato = base.pow(esponente.intValue());
        System.out.println("2^10 = "  + risultato); // stampa "1024"
        BigInteger n1 = new BigInteger("48");
        BigInteger n2 = new BigInteger("18");
        BigInteger mcd = n1.gcd(n2);
        System.out.println("MCD tra 48 e 18: "  + mcd); // stampa "MCD tra 48 e 18: 6"
        BigInteger numero = new BigInteger("-139");
        BigInteger negate = numero.negate();
        System.out.println("Negate = "  + negate); // stampa "Negate = 139"
    }
}