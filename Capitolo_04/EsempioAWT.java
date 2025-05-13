import java.awt.*;		// importo tutti i tipi della libreria java.awt

void main() {
    Frame finestra = new Frame("Titolo");  // creo una finestra con un titolo
    Button pulsante = new Button("Cliccami"); // creo un pulsante
    finestra.add(pulsante);	// aggiungo il pulsante alla finestra
    finestra.setSize(400,100);  // setto la dimensione della finestra a 200 X 100 pixel
    finestra.setVisible(true);  // rendo visibile la finestra
}
