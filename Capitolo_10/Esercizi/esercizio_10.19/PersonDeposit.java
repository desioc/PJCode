// classe che rappresenta il deposito di una persona
public class PersonDeposit implements Runnable {
    private final Safe safe;
    private final int depositAmount;

    public PersonDeposit(Safe safe, int depositAmount) {
        this.safe = safe;
        this.depositAmount = depositAmount;
    }

    @Override
    public void run() {
        // Ogni persona tenta di depositare nella cassaforte
        safe.deposit(depositAmount);
    }
}
