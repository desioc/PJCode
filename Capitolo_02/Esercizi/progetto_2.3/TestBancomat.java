public class TestBancomat {
    public static void main(String[] args) {
        Bancomat mioBancomat = new Bancomat(500);

        System.out.println(mioBancomat.dammiSaldo());

        mioBancomat.eseguiPrelievo(100);
        System.out.println(mioBancomat.dammiSaldo());

        mioBancomat.eseguiPrelievo(50);
        System.out.println(mioBancomat.dammiSaldo());
    }
}