// codice che rispetta YAGNI
public class CalcolatoreSemplice {
    public int somma(int a, int b) {
        return a + b;
    }
}

// codice che viola YAGNI
public class CalcolatoreEsteso {
    public int somma(int a, int b) {
        return a + b;
    }

    public int moltiplica(int a, int b) {
        return a * b;
    }

    public int elevaAPotenza(int a, int b) {
        return (int) Math.pow(a, b);
    }
}

void main() {
    int a = 7;
    int b = 4;
    var calcolatoreSemplice = new CalcolatoreSemplice();
    println(calcolatoreSemplice.somma(a,b));
}
