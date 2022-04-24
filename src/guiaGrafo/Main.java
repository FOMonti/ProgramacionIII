package guiaGrafo;

public class Main {

	public static void main(String[] args) {

		Grafo grafo = new Grafo(4);
		// Trinagulo 0-1-2
		grafo.agregarArista(0, 1);
		grafo.agregarArista(0, 2);
		grafo.agregarArista(1, 2);
		// Trinagulo 1-2-3
		grafo.agregarArista(1, 3);
		grafo.agregarArista(3, 2);
//		System.out.println(Triangulo.cantTriangulos(grafo));
//		Triangulo.mostarTriangulos(grafo);
// 		System.out.println(Distancia.distancia2EntreVertices(grafo, 0, 2));
//		System.out.println(VerticeUniversal.esVerticeUniversal(grafo, 3));
	}
}