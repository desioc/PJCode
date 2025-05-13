public class TestStruttureRicettive {
    public static void main(String[] args) {
        StrutturaRicettiva bnb = new BedAndBreakfast();
        StrutturaRicettiva hotelBase = new Hotel(); // polimorfismo per dati

        bnb.prenota("Camera Rosa");
        hotelBase.prenota("Suite Deluxe");

        Hotel hotel = new Hotel();
        // overload
        hotel.prenota("Camera Blu", "Colazione", "Frigobar", "Sveglia");
        hotel.prenota("Camera Verde"); // nessun servizio extra
    }
}
