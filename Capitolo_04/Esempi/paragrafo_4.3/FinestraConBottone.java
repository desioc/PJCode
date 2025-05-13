import java.awt.*;

public class FinestraConBottone {
    public static void main(String args[]) {
        Frame finestra = new Frame("Titolo");  // creo una finestra con un titolo
        Button pulsante = new Button("Cliccami"); // creo un pulsante
        finestra.add(pulsante);	// aggiungo il pulsante alla finestra
        finestra.setSize(200,100); // setto la dimensione della finestra a 400 X 100 pixel
        finestra.setVisible(true); // rendo visibile la finestra
    }
}