public class TestCliente {
    public static void main(String args[]) {
        var cliente = new Cliente("Marnie" , "Edgar" , "Via A. Hitchcock" , "1964");
        cliente.stampaDati();
        System.out.println(cliente); // il toString viene chiamato automaticamente
    }
}