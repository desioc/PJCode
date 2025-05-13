public class TestPolyExpressionArgument {
    public static void main(String args[]) {
        TestPolyExpressionArgument po2 = new TestPolyExpressionArgument();
        String integer ="2";
        po2.method(	// passiamo un’espressione switch come argomento del metodo!
            switch(integer) {
                case "1" -> 1;
                case "2" -> 2;
                case "3" -> 3;
                default -> -1;
            }
        );
    }
    public void method(int index) {
        System.out.println(index);
    }
}