// record Rettangolo
package com.jeometria;

public record Rettangolo(double base, double altezza) implements Misurabile {
	public Rettangolo {
		if (base <= 0 || altezza <= 0) {
			throw new ValoreNonValidoException("Base e altezza devono essere positivi.");
		}
	}

	@Override
	public double calcolaArea() {
		return base * altezza;
	}

	@Override
	public double calcolaPerimetro() {
		return 2 * (base + altezza);
	}
}