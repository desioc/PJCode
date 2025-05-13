// classe che astrae la prenotazione di un cliente
public class CustomerReservation implements Runnable {
    private final Restaurant restaurant;
    private final String customerName;

    public CustomerReservation(Restaurant restaurant, String customerName) {
        this.restaurant = restaurant;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        // Ogni cliente tenta di prenotare un tavolo
        restaurant.reserveTable(customerName);
    }
}