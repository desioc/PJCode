import java.util.Arrays;

public class TestFlatMap {
    public static void main(String[] args) {
        // Array multidimensionale
        Integer[][] arrayMulti = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        // Appiattimento in un array monodimensionale
        Integer[] arrayMono = Arrays.stream(arrayMulti) // Stream di array
                                    .flatMap(Arrays::stream) // Stream di elementi singoli
                                    .toArray(Integer[]::new); // Converti in array

        // Stampa dell'array monodimensionale
        System.out.println(Arrays.toString(arrayMono)); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
