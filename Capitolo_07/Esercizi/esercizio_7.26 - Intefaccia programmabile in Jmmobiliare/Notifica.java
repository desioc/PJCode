// classe Notifica.java
package com.jmmobiliare.dati;

import java.time.LocalDateTime;

public final class Notifica implements Programmabile {
    private final String messaggio;
    private final String destinatario;
    private LocalDateTime dataProgrammata;

    public Notifica(String messaggio, String destinatario) {
        if (messaggio == null || destinatario == null || messaggio.isBlank() || destinatario.isBlank()) {
            throw new IllegalArgumentException("Messaggio e destinatario devono essere specificati.");
        }
        this.messaggio = messaggio;
        this.destinatario = destinatario;
    }

    public String getMessaggio() {
        return messaggio;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public LocalDateTime getDataProgrammata() {
        return dataProgrammata;
    }

    @Override
    public void programma(LocalDateTime dataOra) {
        this.dataProgrammata = dataOra;
    }

    @Override
    public String toString() {
        return """
            Notifica {
                destinatario = '%s',
                messaggio = '%s',
                data programmata = %s
            }
            """.formatted(destinatario, messaggio, 
                dataProgrammata != null ? dataProgrammata.toString() : "non programmata");
    }
}