public class TestForArray {
    public static void main(String args[]) {
        String [] strings  = { "Antonio" , "Ludwig" , "Johann Sebastian" , "Piotr"} ;
        for (var i = 0; i < strings.length; i++) { // abbiamo usato var al posto in int
            System.out.println(strings[i]);
        }
    }
}