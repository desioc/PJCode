public class TestLabelStatement {
    public static void main(String args[]) {
        labelPerStatement: System.out.println("label"); // etichetta per una stampa (inutile)
        labelPerStatement: {}                           // etichetta per una blocco di codice vuoto (inutile)
        labelPerStatement:;	                        // etichetta per una istruzione vuota (inutile)
    }
}