// esempio che non usa DIP
/* class ProcessorePayPal {
    public void paga(double importo) {
        System.out.println("Pagamento di " + importo + " € con PayPal");
    }
}

class ServizioDiPagamento {
    private ProcessorePayPal processore = new ProcessorePayPal();

    public void effettuaPagamento(double importo) {
        processore.paga(importo);
    }
} */

// esempio che usa DIP
interface ProcessorePagamento {
    void paga(double importo);
}

class ProcessorePayPal implements ProcessorePagamento {
    public void paga(double importo) {
        System.out.println("Pagamento di " + importo + " € con PayPal");
    }
}

class ServizioDiPagamento {
    private ProcessorePagamento processore;

    public ServizioDiPagamento(ProcessorePagamento processore) {
        this.processore = processore;
    }

    public void effettuaPagamento(double importo) {
        processore.paga(importo);
    }
}

void main() {
    ProcessorePagamento processorePayPal = new ProcessorePayPal();
    ServizioDiPagamento servizioDiPagamento = new ServizioDiPagamento(processorePayPal);
    servizioDiPagamento.effettuaPagamento(100);
}
