// record Quadrato
package com.jeometria;

public record Quadrato(double lato) implements Misurabile {
	public Quadrato {
		if (lato <= 0) {
			throw new ValoreNonValidoException("Il lato deve essere positivo.");
		}
	}

	@Override
	public double calcolaArea() {
		return lato * lato;
	}

	@Override
	public double calcolaPerimetro() {
		return lato * 4;
	}
}
