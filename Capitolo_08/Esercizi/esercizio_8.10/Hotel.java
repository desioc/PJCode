public class Hotel extends StrutturaRicettiva {
    @Override
    public void prenota(String camera) {
        System.out.println("Hotel: prenotazione della camera '" + camera + "' effettuata.");
    }

    // Overload con varargs per prenotare anche servizi extra
    public void prenota(String camera, String... serviziExtra) {
        System.out.println("Hotel: prenotazione della camera '" + camera + "' con i seguenti servizi extra:");
        if (serviziExtra.length == 0) {
            System.out.println("  Nessun servizio extra richiesto.");
        } else {
            for (String servizio : serviziExtra) {
                System.out.println("  - " + servizio);
            }
        }
    }
}
