import java.util.*;

public class TestMusicManager {
    public static void main(String[] args) {
        MusicManager manager = new MusicManager();

        System.out.println("=== Stato iniziale ===");
        stampaTuttiGliAlbum(manager);

        // Inserimento nuovo album + canzoni
        Album nuovo = new Album(99, "Esperimento", "Sconosciuto", 2025);
        List<Song> nuoveCanzoni = List.of(
            new Song(101, "Prova 1", 99, 200),
            new Song(102, "Prova 2", 99, 180)
        );

        System.out.println("\nInserimento album e canzoni di test...");
        manager.insertAlbumWithSongs(nuovo, nuoveCanzoni);

        System.out.println("\n=== Dopo inserimento ===");
        stampaTuttiGliAlbum(manager);

        System.out.println("\nCanzoni dell'album 99:");
        manager.getSongsByAlbumId(99).forEach(System.out::println);

        System.out.println("\nAlbum della canzone 101:");
        manager.getAlbumBySongId(101)
               .ifPresentOrElse(System.out::println,
                   () -> System.out.println("Nessun album trovato."));

        System.out.println("\nEliminazione manuale dei dati inseriti...");
        DAO<Song> songDAO = new SongDAO();
        DAO<Album> albumDAO = new AlbumDAO();
        for (Song s : nuoveCanzoni) {
            songDAO.delete(s);
        }
        albumDAO.delete(nuovo);

        System.out.println("\n=== Dopo eliminazione (ripristino) ===");
        stampaTuttiGliAlbum(manager);
    }

    private static void stampaTuttiGliAlbum(MusicManager manager) {
        manager.getAllAlbumsWithSongs().forEach((album, songs) -> {
            System.out.println("Album: " + album);
            for (Song s : songs) {
                System.out.println("  - " + s);
            }
        });
    }
}
