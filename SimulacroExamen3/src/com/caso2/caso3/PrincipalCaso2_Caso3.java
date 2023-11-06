package com.caso2.caso3;

import java.util.ArrayList;

public class PrincipalCaso2_Caso3 {

	public static void main(String[] args) {

		// Caso 2. Dada una lista de objetos de tipo documento (id, tipo, contenido,
		// autor). Crea un método que muestre los datos de los documentos de un
		// determinado tipo. Muestra el número de documentos al final.

		ArrayList<Documento> arDocumentos = new ArrayList<>(); // Lista de objetos tipo documento

		// Objetos de tipo documento documento
		Documento documento1 = new Documento(1, "papel", "bola de papel", "Claudia");
		Documento documento2 = new Documento(2, "digital", "tablet", "Víctor");
		Documento documento3 = new Documento(3, "papel", "escrituras", "Mateo");
		Documento documento4 = new Documento(4, "verbal", "palabras", "Zully");
		Documento documento5 = new Documento(5, "digital", "movil", "Claudia");

		// añado documentos al arraylist
		arDocumentos.add(documento1);
		arDocumentos.add(documento2);
		arDocumentos.add(documento3);
		arDocumentos.add(documento4);
		arDocumentos.add(documento5);

		// mostrar los documentos de un determinado tipo
		mostrarxTipo(arDocumentos, "papel");
		mostrarxTipo(arDocumentos, "digital");

		// --------------------------------
		// Caso 3. Sobre el ejemplo anterior. Genera las listas necesarias para que, en
		// cada una de ellas solo existan los documentos del mismo autor.

		mostrarListasxAutor(arDocumentos);

	}

	// metodo para mostrar los documentos de determinado tipo
	private static void mostrarxTipo(ArrayList<Documento> arDocumentos, String tipo) {
		int numeroTotal = 0;
		for (int i = 0; i < arDocumentos.size(); i++) {
			if (arDocumentos.get(i).getTipo().equalsIgnoreCase(tipo)) {
				System.out.println(arDocumentos.get(i).toString());
				numeroTotal++;
			}
		}
		System.out.println("\nEl total de documentos localizados de tipo " + tipo + " es " + numeroTotal + ".\n");
	}

	// metodo para crear listas solo por el mismo autor
	private static void mostrarListasxAutor(ArrayList<Documento> arDocumentos) {
		ArrayList<Documento> arListaxAutor = new ArrayList<>(); // array para una lista x autor

		// almaceno en primer objeto en una lista
		arListaxAutor.add(arDocumentos.get(0));

		for (int i = 1; i < arDocumentos.size(); i++) { // recorro la lista de documentos
			// verifico si el siguiente documento de la lista contiene el mismo autor de la
			// lista anterior
			if (arDocumentos.get(i).getAutor().equals(arListaxAutor.get(0).getAutor())) {// si es el mismo se añade
				arListaxAutor.add(arDocumentos.get(i));
				System.out.println(arListaxAutor.toString());
			} else { // sino se crea una lista nueva y añade el objeto
				arListaxAutor = new ArrayList<>();
				arListaxAutor.add(arDocumentos.get(i));
				System.out.println(arListaxAutor.toString());
			}

		}

	}
}
