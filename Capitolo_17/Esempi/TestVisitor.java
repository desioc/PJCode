// interfaccia Elemento
interface Elemento {
    void accept(Visitor visitor);
}

// classi concrete
class Cerchio implements Elemento {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitaCerchio(this);
    }
}

class Rettangolo implements Elemento {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitaRettangolo(this);
    }
}

// interfaccia Visitor
interface Visitor {
    void visitaCerchio(Cerchio cerchio);
    void visitaRettangolo(Rettangolo rettangolo);
}

// implementazione concreta del Visitor
class CalcolaAreaVisitor implements Visitor {
    @Override
    public void visitaCerchio(Cerchio cerchio) {
        System.out.println("Calcolo area cerchio...");
    }

    @Override
    public void visitaRettangolo(Rettangolo rettangolo) {
        System.out.println("Calcolo area rettangolo...");
    }
}

// metodo main
void main() {
    Elemento cerchio = new Cerchio();
    Elemento rettangolo = new Rettangolo();

    Visitor visitor = new CalcolaAreaVisitor();

    cerchio.accept(visitor);
    rettangolo.accept(visitor);
}