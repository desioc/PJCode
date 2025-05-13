public class TestWhile {
    public static void main(String args[]) {
        char alfabeto [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'l', 'm', 'n', 'o', 
            'p', 'q', 'r', 's', 't', 'u', 'v', 'z'}; 	// tre istruzioni in una

        int i = 0;						// definizione dell’indice i
        while (i < alfabeto.length) {			        // definizione costrutto while
            System.out.print(alfabeto[i] + " ");	        // caratteri distanziati sulla stessa riga 
            i++;						// incremento dell’indice i (fondamentale)
        }							// fine costrutto while
    }
}