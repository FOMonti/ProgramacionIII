package guiaGrafo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Triangulo {

	private static List<Set<Integer>> triangulos;

	private static int Triangulos(Grafo grafo) {
		triangulos = new ArrayList<Set<Integer>>();
		int ret = 0;
		for (int i = 0; i < grafo.tamano(); i++) {
			ret = ret + cantTriangulosPorVertice(grafo, i);
		}
		return ret;
	}

	private static int cantTriangulosPorVertice(Grafo grafo, int verA) {
		int ret = 0;
		for (Integer verB : grafo.vecinos(verA)) {
			for (Integer verC : grafo.vecinos(verB)) {
				if (verC != verA && existeTriangulo(grafo, verA, verB, verC)) {
					ret++;
				}
			}
		}
		return ret;
	}

	private static boolean existeTriangulo(Grafo grafo, int verticeA, int verticeB, int verticeC) {
		if (grafo.existeArista(verticeA, verticeB) && grafo.existeArista(verticeA, verticeC)
				&& grafo.existeArista(verticeB, verticeC)) {
			boolean trianguloMarcado = false;
			for (Set<Integer> triangulo : triangulos) {
				if (triangulo.contains(verticeA) && triangulo.contains(verticeB) && triangulo.contains(verticeC)) {
					trianguloMarcado = true;
				}
			}
			if (!(trianguloMarcado)) {
				Set<Integer> triangulo = new HashSet<Integer>();
				triangulo.add(verticeA);
				triangulo.add(verticeB);
				triangulo.add(verticeC);
				triangulos.add(triangulo);
				return true;
			}
		}
		return false;
	}

	public static int cantTriangulos(Grafo grafo) {
		return Triangulos(grafo);
	}

	public static void mostarTriangulos(Grafo grafo) {
		for (Set<Integer> triangulo : triangulos) {
			System.out.println(triangulo);
		}
	}

}
