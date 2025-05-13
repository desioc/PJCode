-- Creazione del database
CONNECT 'jdbc:derby:Biblioteca;create=true';

-- Creazione della tabella Libro
CREATE TABLE Libro (
    ID INT PRIMARY KEY,
    Titolo VARCHAR(100),
    Autore VARCHAR(100),
    Anno INT
);

-- Popolamento iniziale della tabella Libro
INSERT INTO Libro (ID, Titolo, Autore, Anno) VALUES
    (1, '1984', 'George Orwell', 1949),
    (2, 'Il Gattopardo', 'Giuseppe Tomasi di Lampedusa', 1958),
    (3, 'Cent''anni di solitudine', 'Gabriel Garcia Marquez', 1967),
    (4, 'Orgoglio e pregiudizio', 'Jane Austen', 1813),
    (5, 'Il ritratto di Dorian Gray', 'Oscar Wilde', 1890),
    (6, 'I racconti del terrore', 'Edgar Allan Poe', 1845),
    (7, 'L''Aleph', 'Jorge Luis Borges', 1949),
    (8, 'L''uomo che ride', 'Victor Hugo', 1869),
    (9, 'La morte di Ivan Ilic', 'Lev Tolstoj', 1886),
    (10, 'Il sosia', 'Fedor Dostoevskij', 1846),
    (11, 'Il processo', 'Franz Kafka', 1925),
    (12, 'La stanza rossa', 'August Strindberg', 1879);
