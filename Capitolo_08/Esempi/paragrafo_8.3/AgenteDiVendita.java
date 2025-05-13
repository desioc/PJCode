public class AgenteDiVendita extends Dipendente {
    private String [] portafoglioClienti;
    private int provvigioni;

    public AgenteDiVendita(int matricola, String nome){
        super(matricola, nome);
    }

    public void setProvvigioni(int provvigioni) {
        this.provvigioni = provvigioni;
    }

    public int getProvvigioni() {
        return provvigioni;
    }


    public void setPortafoglioClienti(String [] portafoglioClienti) {
        this.portafoglioClienti = portafoglioClienti;
    }

    public String [] getPortafoglioClienti() {
        return portafoglioClienti;
    }
}