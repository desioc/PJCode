import java.util.Random;

public class TestScopeVariabili {
    public void metodo(String parametro) {
        // qui è visibile solo la variabile parametro
        var varLocMetodo = new Random().nextInt(3); // valore 0, 1 o 2
        // qui sono visibili solo varLocMetodo e parametro
        if (varLocMetodo == 0) {
            var varLocIf = 0;
            // qui sono visibili solo varLocIf, varLocMetodo e parametro
        } else if (varLocMetodo == 1) {
            var varLocElseIf = 0;
            // qui sono visibili solo varLocElseIf, varLocMetodo e parametro
        } else {
            var varLocElse = 0;
            // qui sono visibili solo varLocElseIf, varLocMetodo e parametro              
        }
        // qui sono visibili solo varLocMetodo e parametro
    }
}