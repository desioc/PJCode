public class TestString {
    public static void main(String args[]) {
        String nom = new String("Gavroche"); // istruzione perfettamente valida
        //String nom = " Gavroche" ;
        String a = "Ubik"      ; 		// istanza inserita nella pool di stringhe
        String b = "Ubik"      ;			// istanza riusata dalla pool di stringhe
        String c = new String("Ubik");	// nuova istanza non inserita nella pool 
        System.out.println(a==b); 	// a e b puntano alla stessa istanza della pool
        System.out.println(b==c);	// c è un nuovo oggetto 

        System.out.println(a.equals(b));  // stampa true perché sono confrontati i contenuti
        System.out.println(b.equals(c));  // stampa true perché sono confrontati i contenuti

        Punto p = new Punto(19,51);		// Oggetto di tipo Punto
        String concatenazione = "Ciao "      + p;	// concatenazione = "Ciao Punto[x=19, y=51]"
        System.out.println(concatenazione);
        p = null;				// Reference di tipo Punto che punta a null
        concatenazione = "Ciao "     + p;	// concatenazione = "Ciao null"
        System.out.println(concatenazione);

        String melkor = "Morgoth" ;
        char charAt2 = melkor.charAt(2);
        System.out.println(charAt2); 		// stampa r

        int indexOfA = melkor.indexOf("o");
        System.out.println(indexOfA);	// stampa 1

        int lunghezza = melkor.length();
        System.out.println(lunghezza); // stampa 7

        String nome = "moravia" ;
        String nomeMaiuscolo = a.toUpperCase();
        System.out.println(nome);             // nome rimane immutato
        System.out.println(nomeMaiuscolo);    // nomeMaiuscolo è la stringa maiuscola

        String s1 = "Elliot" ;
        System.out.println(s1); // stampa Elliot
        s1 = "Alderson" ;
        System.out.println(s1); // stampa Alderson

        // final String s1 = "Elliot" ;
        // s1 = "Alderson" ;	// linea non valida: "cannot assign a value to final variable s1"
    }
}

record Punto(int x, int y) {
}