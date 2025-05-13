public class SingletonExample {
    private static SingletonExample instance;	// unica istanza

    private SingletonExample() {			// costruttore privato
    }

    public static SingletonExample getInstance() {	// metodo factory
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}
