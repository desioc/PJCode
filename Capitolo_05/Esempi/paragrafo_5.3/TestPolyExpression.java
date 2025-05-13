public class TestPolyExpression {
    public static void main(String args[]) {
        String integer = "2" ;
        int index = switch(integer) {
            case "1" -> {
                byte b = 1;
                yield b;
            }
            case "2" -> {
                short s = 2;
                yield s;
            }
            case "3" -> 3;
            default -> -1;
        } ;
    }
}