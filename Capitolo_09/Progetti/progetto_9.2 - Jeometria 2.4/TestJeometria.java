// classe TestJeometria
package com.jeometria.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.jeometria.Cerchio;
import com.jeometria.Jeometria;
import com.jeometria.Misurabile;
import com.jeometria.Quadrato;
import com.jeometria.Rettangolo;
import com.jeometria.Triangolo;

public class TestJeometria {

	@Test
	void testCalcoloAreaPerimetroConQuadrato() {
		Misurabile quadrato = new Quadrato(4);
		assertEquals(16, Jeometria.calcolaArea(quadrato), 0.001);
		assertEquals(16, Jeometria.calcolaPerimetro(quadrato), 0.001);
	}

	@Test
	void testCalcoloAreaPerimetroConCerchio() {
		Misurabile cerchio = new Cerchio(2);
		assertEquals(Math.PI * 4, Jeometria.calcolaArea(cerchio), 0.001);
		assertEquals(2 * Math.PI * 2, Jeometria.calcolaPerimetro(cerchio), 0.001);
	}

	@Test
	void testCalcoloAreaPerimetroConRettangolo() {
		Misurabile rettangolo = new Rettangolo(3, 5);
		assertEquals(15, Jeometria.calcolaArea(rettangolo), 0.001);
		assertEquals(16, Jeometria.calcolaPerimetro(rettangolo), 0.001);
	}

	@Test
	void testCalcoloAreaPerimetroConTriangolo() {
		Misurabile triangolo = new Triangolo(3, 4, 5, 6);
		assertEquals(6, Jeometria.calcolaArea(triangolo), 0.001);
		assertEquals(14, Jeometria.calcolaPerimetro(triangolo), 0.001);
	}

	@Test
	void testCalcoloAreaConNull() {
		try {
			Jeometria.calcolaArea(null);
			fail("Era attesa una NullPointerException.");
		} catch (NullPointerException e) {
			assertNotNull(e.getMessage());
		}
	}

	@Test
	void testCalcoloPerimetroConNull() {
		try {
			Jeometria.calcolaPerimetro(null);
			fail("Era attesa una NullPointerException.");
		} catch (NullPointerException e) {
			assertNotNull(e.getMessage());
		}
	}
}