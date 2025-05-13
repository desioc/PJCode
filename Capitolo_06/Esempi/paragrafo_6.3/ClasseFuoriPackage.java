package com.cdsc;		                          // dichiarazione di appartenenza a package (diverso)
import com.cdsc.modifiers.test.ClassePublic;	          // import della classe da usare

public class ClasseFuoriPackage {                         // dichiarazione delle classe
    public void metodoCheUsaPublic() {                    // dichiarazione di metodo
        var classePublic = new ClassePublic ();           // uso di classe pubblica
        classePublic.metodoPublic();                      // chiamata a metodo pubblico
        System.out.println(classePublic.variabilePublic); // uso variabile pubblica
    }
}
