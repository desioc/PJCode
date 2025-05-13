public class OrdinamentoFilm {
    private boolean ordineCrescente;

    public OrdinamentoFilm(boolean ordineCrescente) {
        this.ordineCrescente = ordineCrescente;
    }

    public int ordinaPerMediaRecensioni(Film film1, Film film2) {
        Integer mediaRecensioniFilm1 = film1.getMediaRecensioni();
        Integer mediaRecensioniFilm2 = film2.getMediaRecensioni();
        return ordineCrescente
            ? mediaRecensioniFilm1.compareTo(mediaRecensioniFilm2)
            : mediaRecensioniFilm2.compareTo(mediaRecensioniFilm1);
    }
}