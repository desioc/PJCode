package com.claudiodesio;		                       // package diverso
import com.claudiodesio.test.ClasseProtected;

public class SottoclasseProtected extends ClasseProtected {
    public void metodoCheUsaMembriProtected() {
        metodoProtected();                           // OK: metodo ereditato
        System.out.println(variabileProtected);      // OK: variabile ereditato
        //var classeProtected = new ClasseProtected(); // istanza della superclasse
        //classeProtected.metodoProtected();           // errore: metodo non visibile!
    }
}