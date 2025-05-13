// product
interface Notifica {
    void invia(String messaggio);
}

// concrete product 
class NotificaEmail implements Notifica {
    @Override
    public void invia(String messaggio) {
        System.out.println("Email inviata: " + messaggio);
    }
}

// concrete product
class NotificaSms implements Notifica {
    @Override
    public void invia(String messaggio) {
        System.out.println("SMS inviato: " + messaggio);
    }
}

// abstract creator
interface NotificaCreator {
    Notifica creaNotifica(); // definizione factory method
}

// concrete creator
class EmailCreator implements NotificaCreator {
    @Override
    public Notifica creaNotifica() { // implementazione factory method
        return new NotificaEmail();
    }
}

// concrete creator 
class SmsCreator implements NotificaCreator {
    @Override
    public Notifica creaNotifica() { // implementazione factory method
        return new NotificaSms();
    }
}

// metodo main
void main(String[] args) {
    NotificaCreator creator = new EmailCreator();
    Notifica notifica = creator.creaNotifica();
    notifica.invia("Benvenuto nel nostro servizio!");

    // possibile switch dinamico
    creator = new SmsCreator();
    creator.creaNotifica().invia("Conferma appuntamento ore 15:00");
}