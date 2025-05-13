// non rispetta ISP
interface DispositivoMultifunzione {
    void stampa();
    void scansiona();
    void inviaFax();
}
// rispetta ISP
interface Stampante {
    void stampa();
}

interface Scanner {
    void scansiona();
}

interface Fax {
    void inviaFax();
}

class StampanteSemplice implements Stampante {
    public void stampa() {
        System.out.println("Stampo un documento");
    }
}

void main(){
    Stampante stampanteSemplice = new StampanteSemplice();
    stampanteSemplice.stampa();
}
