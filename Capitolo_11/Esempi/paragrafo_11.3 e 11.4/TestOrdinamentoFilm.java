import java.util.*;

public class TestOrdinamentoFilm {
    public static void main(String args[]) {
        Videoteca videoteca = new Videoteca();
        List<Film> films = videoteca.getFilms();
        OrdinamentoFilm ordinamentoFilm = new OrdinamentoFilm(false); // Ordinamento decrescente
        System.out.println("\nFilm ordinati per media recensioni (decrescente):");
        Collections.sort(films, ordinamentoFilm::ordinaPerMediaRecensioni);
        stampaFilm(films);

        ordinamentoFilm = new OrdinamentoFilm(true); // Ordinamento crescente
        System.out.println("\nFilm ordinati per media recensioni (crescente):");
        Collections.sort(films, ordinamentoFilm::ordinaPerMediaRecensioni);
        stampaFilm(films);
    }
    
    private static void stampaFilm(List<Film> films) {
        for (Film film: films) {
            if (film != null) {
                System.out.println(film);
            }
        }
    }
}