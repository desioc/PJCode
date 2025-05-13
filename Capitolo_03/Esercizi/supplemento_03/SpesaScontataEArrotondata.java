void main() {
    BigDecimal prezzo1 = new BigDecimal("12.45");
    BigDecimal prezzo2 = new BigDecimal("8.30");
    BigDecimal sconto = new BigDecimal("0.07");

    BigDecimal totale = prezzo1.add(prezzo2);
    BigDecimal scontoCalcolato = totale.multiply(sconto);
    BigDecimal totaleScontato = totale.subtract(scontoCalcolato);
    BigDecimal arrotondato = totaleScontato.setScale(2, RoundingMode.HALF_UP);

    println("Totale scontato e arrotondato: € " + arrotondato);
}