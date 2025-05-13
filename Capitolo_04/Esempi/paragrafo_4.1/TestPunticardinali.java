void main() {
    System.out.println(PuntoCardinale.SUD);       // stampa SUD
    PuntoCardinale p1 = PuntoCardinale.SUD;       // p1 punta all'oggetto SUD
    System.out.println(p1);                       // stampa SUD
    System.out.println(p1 == PuntoCardinale.SUD); // stampa true (stesso indirizzo)
    var p2 = PuntoCardinale.NORD;                 // reference p2 punta a NORD 
    System.out.println(p2);                       // stampa NORD
    System.out.println(PuntoCardinale.EST == PuntoCardinale.OVEST); // stampa false
    var p3 = new PuntoCardinale();                // errore in compilazione
}