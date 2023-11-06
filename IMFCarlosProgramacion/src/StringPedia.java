
public class StringPedia {

	public static void main(String[] args) {
		// STRINGPEDIA (con los métodos básicos de String)

		// puedes cambiar el valor de las variables para hacer pruebas
		String subcadena1 = "Hola";
		String subcadena2 = "Mundo";
		String cadena = "";

		int contador = 0;

		// LONGITUD
		System.out.println("LONGITUD =================");
		// subcadena1.length() devuelve un número int
		System.out.println("El tamaño de subcadena1 es: " + subcadena1.length());

		System.out.println("-------------------------------");

		// COMPARACIÓN
		System.out.println("COMPARACIÓN =================");
		// subcadena1.equals(subcadena2) devuelve un boolean /true o false
		if (subcadena1.equals(subcadena2)) {
			System.out.println("son iguales");
		} else {
			System.out.println("son diferentes");
		}

		// contains

		// comparo la misma cadena pasandola a mayúsculas
		// subcadena1.toUpperCase() devuelve un String
		if (subcadena1.toUpperCase().equals(subcadena1.toUpperCase())) {
			System.out.println("son iguales");
		} else {
			System.out.println("son diferentes");
		}

		// la cadena tiene contenido
		if (cadena.isEmpty()) {
			System.out.println("La cadena esta vacía");
		} else {
			System.out.println("La cadena tiene contenido");
		}

		System.out.println("-------------------------------");

		// POSICIÓN
		System.out.println("POSICIÓN =================");
		// subcadena1.charAt(0) devuelve un valor de tipo char
		System.out.println(subcadena1.charAt(0));

		System.out.println("-------------------------------");

		// CONCATENACIÓN
		System.out.println("CONCATENACIÓN =================");
		cadena = subcadena1.concat(subcadena2);
		System.out.println(cadena);

		cadena = subcadena1.concat(" " + subcadena2);
		System.out.println(cadena);

		System.out.println("-------------------------------");

		// TRIM - quita espacios en blanco delante y detrás de una cadena
		System.out.println("LIMPIA ESPACIOS =================");
		cadena = "   hola mundo   ";
		System.out.println(cadena.trim());

		System.out.println("-------------------------------");
		// BUSCAR

		// indexof, lastindexof devuelven una posición de la cadena
		System.out.println("BUSCAR =================");
		cadena = "abcABCabc";
		// buscando la primera aparición de un char
		System.out.println("posición A:" + cadena.indexOf('A'));

		// buscando la primera aparición de la a desde la posición 3
		System.out.println("posición a 3-:" + cadena.indexOf('a', 3));

		// buscando la primera aparición de un String
		System.out.println("posición abc:" + cadena.indexOf("abc"));

		// buscando la última aparición de un char
		System.out.println("posición b:" + cadena.lastIndexOf('b'));

		// buscando la última aparición de un String
		System.out.println("posición abc:" + cadena.lastIndexOf("abc"));

		// ver si aparece más de una vez una letra
		if (cadena.indexOf('a') == cadena.lastIndexOf('a')) {
			System.out.println("Solo hay una");
		} else {
			System.out.println("Hay más de una");
		}

		// ver si tiene una letra
		if (cadena.indexOf('X') >= 0) {
			System.out.println("Contiene la X");
		} else {// si indexof no encuentra la X devuelve -1
			System.out.println("No contiene la X");
		}

		System.out.println("-------------------------------");

		// SUBCADENA
		System.out.println("SUBCADENA =================");
		cadena = "hola.mundo";
		// entre dos posiciones desde la 1(o) hasta la 3(a , no la incluye)
		System.out.println(cadena.substring(1, 3));
		// desde una posición hasta el final
		System.out.println(cadena.substring(5));
		// partimos en dos, hasta el . y desde el .
		System.out.println(cadena.substring(0, cadena.indexOf('.')));
		System.out.println(cadena.substring(cadena.indexOf('.') + 1));// sumo 1 para que no salga el .

		System.out.println("-------------------------------");

		// RECORRER UNA CADENA
		System.out.println("BUCLES =================");
		cadena = "asdf.qwer.zxcv";
		// toda el string caracter a caracter
		for (int i = 0; i < cadena.length(); i++) {
			System.out.print(" " + cadena.charAt(i));
		}
		System.out.println("");

		// hasta encontrar un . presuponiendo que la cadena tiene al menos un .
		while (cadena.charAt(contador) != '.') {
			System.out.print(" " + cadena.charAt(contador));
			contador++;
		}
		System.out.println("");
		System.out.println("El punto esta en la posición: " + contador);

		// hasta encontrar un . presuponiendo que la cadena puede no tener .
		cadena = "pepe";// prueba otros valores con y sin .
		contador = 0;
		while (contador < cadena.length() && cadena.charAt(contador) != '.') { // ojo debe ser en este orden
			System.out.print(" " + cadena.charAt(contador));
			contador++;
		}
		System.out.println("");

		if (contador == cadena.length()) {
			System.out.println("No se ha encontrado");
		} else {
			System.out.println("El punto esta en la posición: " + contador);

		}

		System.out.println("-------------------------------");

		System.out.println("PUEDES ENCONTRAR TODOS LOS MÉTODOS DE STRING EN:");
		System.out.println("https://docs.oracle.com/javase/7/docs/api/java/lang/String.html");

	}

}
