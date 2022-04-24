package guiaGrafo;

public class VerticeUniversal {

	public static boolean esVerticeUniversal(Grafo grafo, int vertice) {
		int cont = 0;
		for (int i = 0; i < grafo.tamano(); i++) {
			if (i != vertice) {
				if (grafo.existeArista(i, vertice))
					cont++;
			}
		}
		return cont == grafo.tamano() - 1;
	}

}
