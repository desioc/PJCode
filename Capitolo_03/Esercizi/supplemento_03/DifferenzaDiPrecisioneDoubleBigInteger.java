void main() {
    double sommaDouble = 0.1 + 0.2 + 0.3;
    println("Somma con double: " + sommaDouble);

    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = new BigDecimal("0.2");
    BigDecimal bd3 = new BigDecimal("0.3");
    BigDecimal sommaBD = bd1.add(bd2).add(bd3);
    println("Somma con BigDecimal: " + sommaBD);
}
