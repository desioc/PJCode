public class EsempioStatico {
    private int variabileDiIstanza;            	    // variabile d’istanza
    private static int variabileDiClasse;      	    // variabile di classe
    public static void main(String args[]) {	    // metodo static (main)
        //System.out.println(variabileDiIstanza);   // errore: quale è l’istanza?
        System.out.println(variabileDiClasse); 	    // usa variabile della classe
        var es = new EsempioStatico ();	            // istanza esplicita
        System.out.println(es.variabileDiIstanza);  // uso corretto
    }
}