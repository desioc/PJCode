import java.time.LocalDate;

public record Dipendente(
    int id,
    String nome,
    String cognome,
    String dipartimento,
    double salario,
    LocalDate dataAssunzione
) {}
