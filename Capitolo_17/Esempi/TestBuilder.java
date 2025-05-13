// prodotto finale
class Computer {
    private final String cpu;
    private final int ram;
    private final boolean hasBluetooth;
    private final boolean hasWifi;

    // costruttore privato
    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.hasBluetooth = builder.hasBluetooth;
        this.hasWifi = builder.hasWifi;
    }

    public void mostra() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Bluetooth: " + (hasBluetooth ? "sì" : "no"));
        System.out.println("Wi-Fi: " + (hasWifi ? "sì" : "no"));
    }

    // builder interno statico
    public static class ComputerBuilder {
        private final String cpu;
        private final int ram;
        private boolean hasBluetooth = false;
        private boolean hasWifi = false;

        public ComputerBuilder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public ComputerBuilder conBluetooth() {
            this.hasBluetooth = true;
            return this;
        }

        public ComputerBuilder conWifi() {
            this.hasWifi = true;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

// classe del main
public class TestBuilder {
    public static void main(String[] args) {
        Computer pc = new Computer.ComputerBuilder("Intel i9", 16)
            .conBluetooth()
            .conWifi()
            .build();

        pc.mostra();
    }
}