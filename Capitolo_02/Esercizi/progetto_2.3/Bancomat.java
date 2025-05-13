public class Bancomat {
    private int saldo;

    public Bancomat(int saldo) {
        this.saldo = saldo;
    }

    public String dammiSaldo() {
        return "Il saldo è di " + saldo + " euro";
    }

    public void eseguiPrelievo(int importo) {
        saldo -= importo;
    }
}