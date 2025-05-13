public class TestNazioni {

    public static void main(String args[]) {
        Nazione italia = new Nazione();
        italia.nome = "Italia";
        italia.capitale = "Roma";
        italia.popolazione = 60000000;
    
        Nazione francia = new Nazione();
        francia.nome = "Francia";
        francia.capitale = "Parigi";
        francia.popolazione = 67000000;
    
        Nazione spagna = new Nazione();
        spagna.nome = "Spagna";
        spagna.capitale = "Madrid";
        spagna.popolazione = 47000000;
    
        System.out.println("Nazione: " + italia.nome + ", Capitale: " + italia.capitale + ", Popolazione: " + italia.popolazione);
        System.out.println("Nazione: " + francia.nome + ", Capitale: " + francia.capitale + ", Popolazione: " + francia.popolazione);
        System.out.println("Nazione: " + spagna.nome + ", Capitale: " + spagna.capitale + ", Popolazione: " + spagna.popolazione);
    }
}