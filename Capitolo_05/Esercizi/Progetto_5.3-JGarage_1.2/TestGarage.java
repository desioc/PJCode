public class TestGarage {
    public static void main(String args[]) {
        var garage = new Garage();
        var auto1 = new Auto("ZF978324PO" , Dimensione.MEDIA);
        var auto2 = new Auto("PT989798YU" , Dimensione.GRANDE);
        var auto3 = new Auto("YU983950QA" , Dimensione.PICCOLA);
        garage.permettiAccesso(auto1);
        System.out.println("Accesso richiesto da \t" + auto1);
        System.out.println("Auto autorizzata: \t" + garage.cercaAuto(auto1.targa()));
        System.out.println("Auto in garage: \t" + garage.auto);
        garage.permettiAccesso(auto2);
        System.out.println("Accesso richiesto da \t" + auto2);
        System.out.println("Auto autorizzata: \t" + garage.cercaAuto(auto2.targa()));
        System.out.println("Auto in garage: \t" + garage.auto);
        garage.permettiAccesso(auto3);
        System.out.println("Accesso richiesto da \t" + auto3);
        System.out.println("Auto autorizzata: \t" + garage.cercaAuto(auto3.targa()));
        System.out.println("Auto in garage: \t" + garage.auto);
        garage.permettiUscita(auto1);
        System.out.println("Uscita consentita a \t" + auto2);
        System.out.println("Auto in garage: \t" + garage.auto);
        garage.permettiUscita(auto2);
        System.out.println("Uscita consentita a \t" + auto2);
        System.out.println("Auto in garage: \t" + garage.auto);
        garage.permettiAccesso(auto3);
        System.out.println("Accesso richiesto da \t" + auto3);
        System.out.println("Auto autorizzata: \t" + garage.cercaAuto(auto3.targa()));
        System.out.println("Auto in garage: \t" + garage.auto);
    }
}