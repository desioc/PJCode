public class TestPodio {
    public static void main(String args[]) {
        Tennista t1 = new Tennista("Eleonora");
        Tennista t2 = new Tennista("Morella");
        Tennista t3 = new Tennista("Berenice");
        Podio podio = new Podio(t1, t2, t3);
        System.out.println(podio);
    }
}