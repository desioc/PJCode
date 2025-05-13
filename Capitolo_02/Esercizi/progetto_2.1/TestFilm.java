public class TestFilm {
    void main() {
        Film film1 = new Film("Il Signore degli Anelli", "Fantasy", 178);
        Film film2 = new Film("Inception", "Sci-Fi", 148);

        film1.stampaDettagli();
        film2.stampaDettagli();
    }
}