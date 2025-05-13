import java.util.*;

public final class ImmutableObject {
    private final int integer;			// variabile d'istanza primitiva
    private final String string;			// variabile d'istanza complessa immutabile
    private final Calendar calendar;		// variabile d'istanza complessa mutabile
    public ImmutableObject(int integer, String string, Calendar calendar) {
        this.integer = integer;		// tipo primitivo, nessun problema
        this.string = string;			// tipo immutabile, nessun problema
        this.calendar = (Calendar)calendar.clone(); // tipo mutabile -> punto 3
    }
    public Calendar getDate() {
        return (Calendar)calendar.clone();	// tipo mutabile -> punto 4
    }
    @Override public String toString() { 	// metodo toString
        return integer + " – " + string + " – " + calendar;
    }
}
