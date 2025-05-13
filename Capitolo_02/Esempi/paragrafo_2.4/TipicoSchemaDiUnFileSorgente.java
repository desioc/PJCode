public class TipicoSchemaDiUnFileSorgente {
    public static void main(String args[]) {
        // la seguente sintassi si chiama text block: una stringa multilinea 
        // che studieremo nei prossimi capitoli
        String schema = """
                           dichiarazione_di_package;

                           dichiarazione_di_import;

                           dichiarazione_di_classe {

                               dichiarazioni_di_variabili;

                               dichiarazioni_di_costruttori {
                               }

                               dichiarazioni_di_metodi {
                               }
                           }""";
        System.out.println(schema);
    }
}