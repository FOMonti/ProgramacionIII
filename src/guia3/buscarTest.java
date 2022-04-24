package guia3;

import static org.junit.Assert.*;

import org.junit.Test;

public class buscarTest {

	private Metodo met = new Metodo();

	@Test
	public void happyTest() {
		int[] b = { 1, 2, 3 };
		int x = 3;
		assertTrue(met.buscar(b, x));
	}

	@Test
	public void arrayVacio() {
		int[] b = {};
		int x = 3;
		assertFalse(met.buscar(b, x));
	}

	@Test
	public void sinEncontrar() {
		int[] b = { 1, 2, 3 };
		int x = 4;
		assertFalse(met.buscar(b, x));
	}

	@Test(expected = NullPointerException.class)
	public void arrayNull() {
		int[] b = null;
		int x = 5;
		assertTrue(met.buscar(b, x));
	}
}
