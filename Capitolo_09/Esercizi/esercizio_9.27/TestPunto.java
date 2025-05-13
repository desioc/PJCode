import org.junit.jupiter.api.*;

public class TestPunto {

	private Punto p1, p2;
	private Punto3D p3d1, p3d2;

	@BeforeEach
	public void setUp() {
		p1 = new Punto(3, 4);
		p2 = new Punto(3, 4);
		p3d1 = new Punto3D(1, 2, 3);
		p3d2 = new Punto3D(4, 6, 3);
	}

	@Test
	public void testDistanzaConNull() {
		try {
			p1.dammiDistanza(null);
			Assertions.fail("IllegalArgumentException lanciata volutamente");
		} catch (IllegalArgumentException e) {
			// Test passed
		}
	}

	@Test
	public void testDistanzaPuntiConStesseCoordinate() {
		double distanza = p1.dammiDistanza(p2);
		Assertions.assertEquals(0.0, distanza);
	}

	@Test
	public void testDistanzaStessoPunto() {
		double distanza = p1.dammiDistanza(p1); // stesso oggetto
		Assertions.assertEquals(0.0, distanza);
	}

	@Test
	public void testDistanzaStessoPunto3D() {
		double distanza = p3d1.dammiDistanza(p3d1); // stesso oggetto
		Assertions.assertEquals(0.0, distanza);
	}

	@Test
	public void testDistanzaPunti3DConStesseCoordinate() {
		Punto3D p3d3 = new Punto3D(1, 2, 3); // stesso valore di coordinate di p3d1
		double distanza = p3d1.dammiDistanza(p3d3);
		Assertions.assertEquals(0.0, distanza);
	}

	@Test
	public void testDistanzaTraPunti3D() {
		double distanza = p3d1.dammiDistanza(p3d2);
		Assertions.assertEquals(5.0, distanza); // distanza 5 (calcolato a mano)
	}

	@Test
	public void testDistanzaPuntoConPunto3D() {
		try {
			p1.dammiDistanza(p3d1);
			Assertions.fail("Expected IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			// Test passed
		}
	}

	@Test
	public void testDistanzaPunto3DConPunto() {
		try {
			p3d1.dammiDistanza(p1);
			Assertions.fail("Expected IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			// Test passed
		}
	}

	@AfterEach
	public void tearDown() {
		p1 = null;
		p2 = null;
		p3d1 = null;
		p3d2 = null;
	}
}
