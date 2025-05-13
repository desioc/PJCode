-- Creazione del database ImmobiliDB
CONNECT 'jdbc:derby:ImmobiliDB;create=true';

-- Creazione della tabella Immobile
CREATE TABLE Immobile (
    Id INT PRIMARY KEY,
    Tipo VARCHAR(20) NOT NULL,              -- "Appartamento", "Garage", "Palazzo"
    Indirizzo VARCHAR(100) NOT NULL,
    MetriQuadri INT NOT NULL,
    Prezzo DOUBLE NOT NULL,
    
    -- Campi specifici per Appartamento
    NumeroVani INT,
    Piano INT,

    -- Campo specifico per Garage
    PostiAuto INT

    -- Palazzo non ha campi aggiuntivi per ora
);
