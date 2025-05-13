class SuperInizializzatore { 
    {
        System.out.println("Inizializzatore della superclasse invocato");
    }
}

class SottoclasseDiSuperInizializzatore extends SuperInizializzatore { }

public class TestSuperInizializzatore {
    public static void main(String args[]) {
        new SottoclasseDiSuperInizializzatore();
    }
}