package com.cdsc;
import com.cdsc.test.*;

public class TestClassePubblica {
    public static void main(String args[]) {
        var c = new ClasseSenzaModificatore(); 	// OK!
        c.variabileVisibileInPackage = 0;		// errore: variabile non visibile
        c.metodoVisibileInPackage();			// errore: metodo non visibile
    }
}
