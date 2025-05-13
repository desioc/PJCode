import java.util.List;

public class TestDBExplorer implements DBExplorer {

    public static void main(String[] args) {
        TestDBExplorer tester = new TestDBExplorer();

        System.out.println("--- Tutti i contatti ---");
        List<Contact> contatti = tester.getContacts();
        for (Contact c : contatti) {
            System.out.println(c);
        }

        System.out.println("\n--- Ricerca per nome: 'James Gosling' ---");
        Contact trovato = tester.findByName("James Gosling");
        if (trovato != null) {
            System.out.println("Trovato: " + trovato);
        } else {
            System.out.println("Nessun contatto trovato.");
        }
    }
}
