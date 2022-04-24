package guia3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class sumarPositivosTest {

	private Metodo met = new Metodo();
	int[] c;

	@Before
	public void incializar() {
		c = new int[2];
		c[0] = 1;
		c[1] = 2;
	}

	@Test
	public void happyTest() {
		// int[] b = { 1, 2 };
		assertEquals(3, met.sumarPositivos(c));
	}

	@Test
	public void arrayVacio() {
		int[] b = new int[0];
		assertTrue(met.sumarPositivos(b) == 0);
	}

	@Test
	public void ValoresNegativos() {
		int[] b = { -1, -2, -3, -4 };
		assertTrue(met.sumarPositivos(b) == 0);
	}

	@Test
	public void ValoresNegativosYpositivos() {
		int[] b = { -1, 5, -3, -4, -2, 8 };
		assertTrue(met.sumarPositivos(b) == 13);
	}

	@Test
	public void unUnicoValorPorArray() {
		int[] b = { 5 };
		assertTrue(met.sumarPositivos(b) == b[0]);
		int[] c = { 3 };
		assertTrue(met.sumarPositivos(c) == c[0]);
		int[] d = { 1 };
		assertTrue(met.sumarPositivos(d) == d[0]);
	}

	@Test(expected = NullPointerException.class)
	public void arrayNullExcepcion() {
		int[] b = null;
		met.sumarPositivos(b);
	}

}
