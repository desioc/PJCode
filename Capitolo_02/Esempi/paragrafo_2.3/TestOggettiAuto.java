public class TestOggettiAuto {               // dichiarazione della classe del main
    public static void main(String args[]) { // dichiarazione del metodo main
        Auto panda = new Auto();             // istanza dell'oggetto panda di tipo Auto 
        panda.cilindrata = 1300;             // impostazione della cilindrata di panda
        panda.accelera();                    // chiamata al metodo accelera di panda
        Auto california = new Auto();        // istanza dell'oggetto california di tipo Auto
        california.cilindrata = 4300;        // impostazione della cilindrata di california
        california.accelera();               // chiamata al metodo accelera di california
    }                                        // chiusura del metodo main
}                                  