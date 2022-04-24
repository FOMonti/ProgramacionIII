package guia3;

import java.util.Random;

public class Metodo {

	public Metodo() {
	}

	public int sumarPositivos(int[] b) {
		if (b == null)
			throw new NullPointerException("el arreglo b no puede ser null!");

		int suma = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] > 0)
				suma += b[i];
		}
		return suma;
	}

	public boolean buscar(int[] b, int x) {
		int i = 0;
		while (i < b.length && b[i] != x)
			i++;
		return (i < b.length);
	}

	public int segundoMayor(int[] arreglo) {
		if (arreglo.length < 2)
			throw new IllegalArgumentException("Pocos elementos!");

		int max = Math.max(arreglo[0], arreglo[1]);
		int ret = Math.min(arreglo[0], arreglo[1]);

		for (int i = 2; i < arreglo.length; ++i) {
			if (arreglo[i] > max) {
				ret = max;
				max = arreglo[i];
			} else if (arreglo[i] > ret)
				ret = arreglo[i];
		}

		return ret;
	}

}
