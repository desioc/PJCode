import java.util.ArrayList;
import java.util.List;
// interfaccia mediator
public interface ChatMediator {
    void inviaMessaggio(String messaggio, Utente utente);
}

// classe concreta mediator
public class ChatRoom implements ChatMediator {
    private List<Utente> utenti = new ArrayList<>();

    public void aggiungiUtente(Utente utente) {
        utenti.add(utente);
    }

    @Override
    public void inviaMessaggio(String messaggio, Utente mittente) {
        for (Utente u : utenti) {
            if (u != mittente) {
                u.ricevi(messaggio);
            }
        }
    }
}

// classe colleague (Utente)
public abstract class Utente {
    protected ChatMediator mediatore;
    protected String nome;

    public Utente(ChatMediator mediatore, String nome) {
        this.mediatore = mediatore;
        this.nome = nome;
    }

    public abstract void invia(String messaggio);
    public abstract void ricevi(String messaggio);
}

// classe concreta di Utente
public class UtenteChat extends Utente {

    public UtenteChat(ChatMediator mediatore, String nome) {
        super(mediatore, nome);
    }

    @Override
    public void invia(String messaggio) {
        System.out.println(nome + " invia: " + messaggio);
        mediatore.inviaMessaggio(messaggio, this);
    }

    @Override
    public void ricevi(String messaggio) {
        System.out.println(nome + " riceve: " + messaggio);
    }
}

// esempio di utilizzo
void main() {
    var chatRoom = new ChatRoom();

    var utente1 = new UtenteChat(chatRoom, "Rosetta");
    var utente2 = new UtenteChat(chatRoom, "Buddy");
    var utente3 = new UtenteChat(chatRoom, "Albert");

    chatRoom.aggiungiUtente(utente1);
    chatRoom.aggiungiUtente(utente2);
    chatRoom.aggiungiUtente(utente3);

    utente1.invia("Ciao a tutti!");
}
