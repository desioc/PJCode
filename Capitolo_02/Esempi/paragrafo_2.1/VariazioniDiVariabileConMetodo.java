void main(String args[]) {
    double tassoDiConversione = 1.1;
    stampaTassoDiConversione(tassoDiConversione);
    tassoDiConversione = tassoDiConversione + 0.2;
    stampaTassoDiConversione(tassoDiConversione);
    tassoDiConversione = tassoDiConversione - 0.3;
    stampaTassoDiConversione(tassoDiConversione);
}

void stampaTassoDiConversione(double tasso) {
    println("Valore attuale del tasso di conversione");
    println(tasso);
}