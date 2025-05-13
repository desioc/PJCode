// classe del main
public class RestaurantReservationSystem {
    public static void main(String[] args) {
        // Creiamo un ristorante con 3 tavoli disponibili
        Restaurant restaurant = new Restaurant(3);
        
        // Creiamo 5 thread che cercano di prenotare i tavoli
        for (int i = 0; i < 5; i++) {
            new Thread(new CustomerReservation(restaurant, "Cliente " + (i + 1))).start();
        }
    }
}