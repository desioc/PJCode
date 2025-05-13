
public class Punto {
	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
     /* 
        // equals classico
        @Override 
        public boolean equals(Object altroOggetto) { // parametro polimorfo
            if (!(altroOggetto instanceof Punto)) {  // se non sono dello stesso tipo
                return false;                        // ritorna false
            }
            Punto altroPunto = (Punto) altroOggetto;                 // cast da Object a Punto
            return this.x == altroPunto.x && this.y == altroPunto.y; // confronto variabili
        } */

        // equals classico con pattern matching
        @Override
        public boolean equals(Object altroOggetto) {
            if (!(altroOggetto instanceof Punto altroPunto)) {
                return false;
            }
            return this.x == altroPunto.x && this.y == altroPunto.y;
        }


     /* 
        // equals prodotto da Eclipse
        @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}


        // hashCode prodotto da Eclipse
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	} */
}
