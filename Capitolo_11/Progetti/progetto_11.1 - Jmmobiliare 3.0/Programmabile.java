// interfaccia Programmabile.java
package com.jmmobiliare.dati;

import java.time.LocalDateTime;

public sealed interface Programmabile permits Annuncio, Notifica {
    void programma(LocalDateTime dataOra);
}
