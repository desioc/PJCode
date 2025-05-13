import java.util.*;

public class Garage {
	public final static int NUM_MAX_AUTO = 2;
	public ArrayList<Auto> auto;

	public Garage() {
		auto = new ArrayList<>();
	}

	public void permettiAccesso(Auto veicolo) {
		if (numeroAutoParcheggiate() < NUM_MAX_AUTO) {
			auto.add(veicolo);
		}
	}

	public void permettiUscita(Auto veicolo) {
		auto.remove(veicolo);
	}

	public int numeroAutoParcheggiate() {
		return auto.size();
	}

	public boolean cercaAuto(String targa) {
		if (targa != null) {
			for (Auto unAuto : auto) {
				if (targa.equals(unAuto.targa())) {
					return true;
				}
			}
		}
		return false;
	}
}