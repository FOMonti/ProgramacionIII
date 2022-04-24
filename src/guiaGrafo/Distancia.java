package guiaGrafo;

import java.util.Set;

public class Distancia {

	public static boolean distancia2EntreVertices(Grafo grafo, int verticeA, int verticeB) {
		Set<Integer> vecinosDeA = grafo.vecinos(verticeA);
		for (Integer vecinoDeA : vecinosDeA) {
			/*
			 * La siguiente condicion verifica que no se encuentre a distancia 1, sin
			 * embargo 2 vertices pueden estar a distancia 1 y 2 tambien, depende de la
			 * implementacion si la condicion se deja o no
			 */
//			if (verticeB == vecinoDeA) {	
//				return false;
//			}
			if (existeAristaVecinoDeVecinoConVertice(grafo, vecinoDeA, verticeB)) {
				return true;
			}
		}
		return false;
	}

	private static boolean existeAristaVecinoDeVecinoConVertice(Grafo grafo, int verticeVecino, int vertice) {
		Set<Integer> vecinosDeVecinoDe = grafo.vecinos(verticeVecino);
		for (Integer verticeVecinoDeVecino : vecinosDeVecinoDe) {
			if (verticeVecinoDeVecino == vertice) {
				return true;
			}
		}
		return false;
	}

}
