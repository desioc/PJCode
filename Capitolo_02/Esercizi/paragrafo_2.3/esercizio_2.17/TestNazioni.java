public class TestNazioni {

    public static void main(String args[]) {
        Nazione italia = new Nazione("Italia" , "Roma" , 60000000);
        Nazione francia = new Nazione("Francia" , "Parigi" , 67000000);
        Nazione spagna = new Nazione("Spagna" , "Madrid" , 47000000);

        italia.stampaInformazioni();
        francia.stampaInformazioni();
        spagna.stampaInformazioni();
    }
}