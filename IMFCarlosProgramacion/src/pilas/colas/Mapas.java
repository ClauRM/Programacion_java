package pilas.colas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapas {

	public static void main(String[] args) {
		// https://jarroba.com/map-en-java-con-ejemplos/
		Integer key;
		Map<Integer, String> mapa = new HashMap<Integer, String>();

		// añadir (put) asociado a una clave
		mapa.put(1, "Pepe");
		mapa.put(2, "Lola");
		mapa.put(3, "Luis");
		mapa.put(4, "Maria");

		System.out.println(mapa.get(3)); // muestra el valor de la clave 3
		System.out.println(mapa.size()); // muestra tamaño
		mapa.remove(3); // borra el valor de la clave 3
		System.out.println(mapa.get(3)); // muestra el valor de la clave 3 despues de borarlo (null)
		System.out.println(mapa.size()); // muestra el tamaño sin null
		mapa.clear(); // borra todos los datos el mapa
		System.out.println(mapa.size()); // muestra su tamaño

		mapa.put(1, "Pepe");
		mapa.put(2, "Lola");
		mapa.put(3, "Luis");
		mapa.put(4, "Maria");
		// OJO!!, si se añaden valores a una posicion existente, se "machacan"
		mapa.put(3, "Luis");
		mapa.put(4, "Marian");

		/*
		 * nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave
		 * que coincide con K nombreMap.containsValue(V valor); // Devuelve true si en
		 * el map hay un Valor que coincide con V nombreMap.values(); // Devuelve una
		 * "Collection" con los valores del Map
		 */

		// Imprimimos el Map con un Iterador
		Iterator<Integer> it = mapa.keySet().iterator();
		while (it.hasNext()) {
			key = (Integer) it.next();
			System.out.println("Clave: " + key + " -> Valor: " + mapa.get(key));
		}

	}

}
