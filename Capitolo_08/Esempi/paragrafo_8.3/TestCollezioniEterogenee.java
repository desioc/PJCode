public class TestCollezioniEterogenee {
    public static void main(String args[]) {
        Dipendente [] arr = new Dipendente [180];
        arr[0] = new Dirigente();
        arr[1] = new Programmatore();
        arr[2] = new AgenteDiVendita();
        //...
        for (int i = 3; i < 180; i++) {
            arr[i] = new Programmatore();
        }

        TestCollezioniEterogenee ogg = new TestCollezioniEterogenee();
        for (Dipendente dipendente : arr) {
            ogg.pagaDipendente(dipendente);
        }
    }

    public void pagaDipendente(Dipendente dip) {
        if (dip instanceof Programmatore) {
            dip.stipendio = 1200;
        }
        else if (dip instanceof Dirigente) {
            dip.stipendio = 3000;
        }
        else if (dip instanceof AgenteDiVendita) {
            dip.stipendio = 1000;
        }
        System.out.println(dip.getClass().getName() + " - Stipendio = " + dip.stipendio);
        //. . .
    }
}