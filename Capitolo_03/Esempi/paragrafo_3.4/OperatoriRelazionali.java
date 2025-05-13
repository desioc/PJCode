public class OperatoriRelazionali {
    public static void main(String args[]) {
        // le parentesi graffe ci permettono di creare la variabile locale b 
        {boolean b = (9 == 9);} // b vale true
        int i = 10;
        double d = 10.0;
        boolean b1 = (i != d); // b1 vale false
        boolean b2 = b1 == (i >= 11); // b2 vale true
        // boolean b2 = false == (false);
        boolean and = true & false; // and è false
        boolean or = and | !false; // or è true
        boolean xor = and ^ or; // xor è true
        and = or & xor; // and è true
        or = !(xor | and); // or è false
        xor = (and ^ !or); // xor è false;
        int a = 10, b = 20;
        boolean flag = ( (a != 0) && (b/a > 10) );
        flag = ( (a == 0) || (b/a > 10) );
    }
}