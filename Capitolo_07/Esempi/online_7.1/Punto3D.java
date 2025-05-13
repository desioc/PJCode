public class Punto3D extends Punto {
    private int z;

    // costruttore senza parametri
    public Punto3D() {
    }

    public Punto3D(int x, int y, int z) {
        // riuso di codice
        this.setXYZ(x, y, z); 
    }

    public void setZ(int z) {
        this.z = z; // il this non è facoltativo
    }

    public void setXYZ(int x, int y, int z) {
        // riuso del codice
        this.setXY(x, y);
        this.setZ(z); // il this è facoltativo
    }

    public int getZ() {
        return this.z; // il this è facoltativo
    }
    
    public double dammiDistanza(Punto p) {
        if (p instanceof Punto3D) {
            // chiamata a un metodo privato tramite casting
            return this.calcolaDistanza((Punto3D) p);
        } else {
            return -1; // distanza non valida
        }
    }

    private double calcolaDistanza(Punto3D altroPunto) {
        // quadrato della differenza delle x dei due punti
        int tmp1 = 
          (this.getX() - altroPunto.getX()) * 
          (this.getX() - altroPunto.getX()); 
        // quadrato della differenza delle y dei due punti
        int tmp2 = 
          (this.getY() - altroPunto.getY()) * 
          (this.getY() - altroPunto.getY());
        // quadrato della differenza delle z dei due punti 
        int tmp3 = 
          (this.getZ() - altroPunto.getZ()) * 
          (this.getZ() - altroPunto.getZ());
        // radice quadrata della somma dei tre quadrati 
        return Math.sqrt(tmp1 + tmp2 + tmp3);
    }


}
