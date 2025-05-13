// singleton
class Logger {
    private Logger() {
        System.out.println("Logger inizializzato");
    }

    private static class Holder { // classe innestata statica
        private static final Logger instance = new Logger();
    }

    public static Logger getInstance() {
        return Holder.instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

// metodo main
public class TestSingleton {
    public static void main(String args[]) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Messaggio uno");
        logger2.log("Messaggio due");

        System.out.println("Le due istanze sono uguali? " + (logger1 == logger2));
    }
}