public class TestLabelBloccoDiCodice {
    public static void main(String args[]) {
        int j = 1;
        labelPerBloccoDiCodice:            // possiamo assegnare un qualsiasi nome a una label 
        {				   // definizione di un blocco di codice (etichettato)
            while (true) {
                if (j > 10)
                    break labelPerBloccoDiCodice;  // esce fuori dal blocco di codice
                System.out.println(j);
                j++;
            }
        //  System.out.println("Questo non verrà mai stampato!");
        }				   // fine del blocco di codice etichettato
    }
}