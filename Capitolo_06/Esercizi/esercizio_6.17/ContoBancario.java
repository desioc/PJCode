public class ContoBancario {

    private String numeroConto;
    private double saldo;

    // Costruttore con solo numeroConto
    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }

    // Costruttore con numeroConto e saldo iniziale
    public ContoBancario(String numeroConto, double saldo) {
        this.numeroConto = numeroConto;
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Errore: il saldo iniziale non può essere negativo. Impostato a 0.");
            this.saldo = 0;
        }
    }

    // Getter
    public String getNumeroConto() {
        return numeroConto;
    }

    public double getSaldo() {
        return saldo;
    }

    // Metodo per depositare un importo
    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
        } else {
            System.out.println("Errore: non è possibile depositare un importo negativo.");
        }
    }

    // Metodo per prelevare un importo
    public void preleva(double importo) {
        if (importo <= saldo && importo > 0) {
            saldo -= importo;
        } else if (importo <= 0) {
            System.out.println("Errore: l'importo da prelevare deve essere positivo.");
        } else {
            System.out.println("Errore: saldo insufficiente per il prelievo.");
        }
    }
}
