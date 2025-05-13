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
    	// soluzione del punto 1
        if (p == null) {
            throw new IllegalArgumentException("Il punto passato non può essere null.");
        }
        // soluzione del punto 2
        if (this == p || this.getX() == p.getX() && this.getY() == p.getY()) { // stesso oggetto o stesse coordinate
            return 0.0;
        }
        // soluzione del punto 3
        if (p instanceof Punto3D p3d) {
            if (getX() == p3d.getX() && getY() == p3d.getY() && getZ() == p3d.getZ()) {
                return 0.0;
            }
            int tmp1 = (getX() - p3d.getX()) * (getX() - p3d.getX());
            int tmp2 = (getY() - p3d.getY()) * (getY() - p3d.getY());
            int tmp3 = (z - p3d.getZ()) * (z - p3d.getZ());
            return Math.sqrt(tmp1 + tmp2 + tmp3);
        } else {
            throw new IllegalArgumentException("Non posso calcolare la distanza tra Punto3D e Punto.");
        }
    }

    private double calcolaDistanza(Punto3D altroPunto) {
    	// soluzione del punto 1
    	if (altroPunto == null) {
            throw new IllegalArgumentException("Il punto passato non può essere null.");
        }
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
