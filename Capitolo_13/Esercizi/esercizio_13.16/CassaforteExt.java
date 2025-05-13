import java.io.*;

public class CassaforteExt implements Externalizable {
    private String marca;
    private String modello;
    private int combinazione;

    public CassaforteExt() {}

    public CassaforteExt(String marca, String modello, int combinazione) {
        this.marca = marca;
        this.modello = modello;
        this.combinazione = combinazione;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(modello);
        out.writeUTF("XXXXXX");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException {
        this.modello = in.readUTF();
        in.readUTF(); // leggiamo ma ignoriamo "XXXXXX"
        this.combinazione = 0;
        this.marca = null;
    }

    @Override
    public String toString() {
        return "CassaforteExt[marca=" + marca + ", modello=" + modello + ", combinazione=" + combinazione + "]";
    }
}
