import java.util.*;

public class AmministrazioneAzienda {

    private Set<Dipendente> dipendenti;

    public AmministrazioneAzienda() {
        dipendenti = new HashSet<>();
        caricaDipendenti();
    }

    public void caricaDipendenti() {
        dipendenti.add(new Dirigente(1, "Lostris"));
        dipendenti.add(new Programmatore(2, "Taita"));
        dipendenti.add(new AgenteDiVendita(3, "Tanus"));
        dipendenti.add(new AgenteDiVendita(3, "Mamose"));
        //dipendenti[2].setProvvigioni(300); provoca un errore
        //...potremmo continuare...
    }

    public void pagaDipendente(Dipendente dip) {
        if (dip instanceof Programmatore) {
            dip.setStipendio(1500);
        }
        else if (dip instanceof Dirigente) {
            dip.setStipendio(3000);
        }
        else if (dip instanceof AgenteDiVendita) {
            AgenteDiVendita adv = (AgenteDiVendita)dip;
            adv.setStipendio(1000 + adv.getProvvigioni());
        }
        System.out.println(dip.getClass().getName() + " - Stipendio = " + dip.getStipendio());
    }
        
    public static void main(String args[]) {
        AmministrazioneAzienda aa = new AmministrazioneAzienda();
        for (Dipendente dipendente : aa.dipendenti) {
            aa.pagaDipendente(dipendente);
        }
    }

}