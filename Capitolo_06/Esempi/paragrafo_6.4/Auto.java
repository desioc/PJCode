public class Auto {
    private String tipo;
    public Auto(String marca) {
        this.tipo = tipo;
    }
    public class Motore {
        private int cilindrata;
        public Motore(int cilindrata) {
            this.cilindrata = cilindrata;
        }
        public void accendi() {
            System.out.println("Il motore della " + tipo + " è acceso.");
        }
    }
}
