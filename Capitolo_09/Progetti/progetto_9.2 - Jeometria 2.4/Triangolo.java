// classe Triangolo
package com.jeometria;

public record Triangolo(double base, double altezza, double lato1, double lato2) implements Misurabile {
	public Triangolo {
		if (base <= 0 || altezza <= 0 || lato1 <= 0 || lato2 <= 0) {
			throw new ValoreNonValidoException("Tutti i lati e l'altezza devono essere positivi.");
		}
	}

	@Override
	public double calcolaArea() {
		return (base * altezza) / 2;
	}

	@Override
	public double calcolaPerimetro() {
		return base + lato1 + lato2;
	}
}