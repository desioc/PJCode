-- Creazione tabella Song
CREATE TABLE Song (
    SongId INT PRIMARY KEY,
    Title VARCHAR(255) NOT NULL,
    AlbumId INT NOT NULL,
    Duration INT,
    FOREIGN KEY (AlbumId) REFERENCES Album (AlbumId)
);

-- Inserimento canzoni associate agli album esistenti
INSERT INTO Song (SongId, Title, AlbumId, Duration) VALUES
(1, 'Highway Star', 1, 370),
(2, 'Smoke on the Water', 1, 320),
(3, 'Iter Impius', 2, 420),
(4, 'Pluvius Aestivus', 2, 270),
(5, 'Pull Me Under', 3, 510),
(6, 'Another Day', 3, 320),
(7, 'Day Two: Isolation', 4, 390),
(8, 'Day Three: Pain', 4, 420);
