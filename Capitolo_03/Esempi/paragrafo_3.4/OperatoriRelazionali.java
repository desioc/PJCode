public class OperatoriRelazionali {
    public static void main(String args[]) {
        // le parentesi graffe ci permettono di creare la variabile locale b 
        {boolean b = (9 == 9);} // b vale true
        int i = 10;
        double d = 10.0;
        boolean b1 = (i != d); // b1 vale false
        boolean b2 = b1 == (i >= 11); // b2 vale true
        // boolean b2 = false == (false);
        boolean and = true & false; // and � false
        boolean or = and | !false; // or � true
        boolean xor = and ^ or; // xor � true
        and = or & xor; // and � true
        or = !(xor | and); // or � false
        xor = (and ^ !or); // xor � false;
        int a = 10, b = 20;
        boolean flag = ( (a != 0) && (b/a > 10) );
        flag = ( (a == 0) || (b/a > 10) );
    }
}