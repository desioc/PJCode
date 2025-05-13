public class Lampadina { 
    public boolean accesa;     // variabile da cui dipende lo stato di un oggetto
    public void faiLuce() {    // metodo che dipende dallo stato
        if (accesa == true) {  // si legge "Se accesa vale true"
            System.out.println("Lampadina accesa"); 
        } else {			// si legge "altrimenti" o "Se accesa vale false"
            System.out.println("Lampadina spenta");
        }
    }
}