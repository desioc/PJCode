public class TestaOCroce {
    public String dammiTestaOCroce() {
        PariODispari pariODispari = new PariODispari();
        String pariODispariString = pariODispari.dammiPariODispari();
        String testaOCroce = switch (pariODispariString) {
            case "Pari" -> "Testa";
            case "Dispari" -> "Croce";
            default -> "C'è un Bug!!!";
        };
        return testaOCroce;
    }
}