public class TestWhile {
    public static void main(String args[]) {
        char alfabeto [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'l', 'm', 'n', 'o', 
            'p', 'q', 'r', 's', 't', 'u', 'v', 'z'}; 	// tre istruzioni in una
        int i = 0;
        while (i < alfabeto.length) {
            System.out.print(alfabeto[i] + " ");
            i++;
        }
    }
}