public class Outer {  					// classe esterna
    private String messaggio = "Nella classe ";	// variabile d�istanza
    private void stampaMessaggio() {			// metodo d�istanza	
        System.out.println(messaggio + "Esterna");
    } 
    // classe interna che accede ai membri privati della classe Outer 
    public class Inner {
        public void usaVariabile() {       // metodo d�istanza della classe interna
            System.out.println(messaggio + "Interna"); // uso variabile di Outer
        } 
        public void chiamaMetodo() { // metodo d�istanza della classe interna
            stampaMessaggio();	      // uso metodo di Outer
        }
        //...
    }
    //...
}
