public class InstanceInitializer {
    public InstanceInitializer() {
        System.out.println("Costruttore");
    }

    {							// inizializzatore d’istanza
        System.out.println("Inizializzatore");   
    }							// fine inizializzatore d’istanza
}
