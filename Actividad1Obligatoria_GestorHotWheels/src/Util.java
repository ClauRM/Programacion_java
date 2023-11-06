import java.util.Scanner;

/**
 * <h2>Clase Util, contiene las utilidades del programa</h2>
 * 
 * @author claudia rubio
 * @version 03-2022
 *
 */
public class Util {

	/**
	 * Objeto de la clase Scanner, accesible desde cualquier clase del proyecto
	 */
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Método posicionNullArray, recibe un array de String como parámetro y verifica
	 * si hay alguna posición libre dentro del array para seguir almacenando.
	 * 
	 * @param String array[], contiene datos almacenados o no en el array.
	 * @return i, variable tipo int con la primera posición vacía en el array
	 */
	public static int posicionNullArray(String array[]) {// METODO PARA LOCALIZAR PRIMERA POSICION NULL EN ARRAY
		int i = 0;
		boolean localizado = false;
		do {
			if ((array[i] != null && array[i] != "")) {
				i++; // SI LA POSICION i NO ES VACIA NI NULA SE INCREMENTA
			} else {
				System.out.println("Se ha localizado una posión vacía en " + i);
				localizado = true; // SI ES NULA SALE DEL BUCLE Y RETORNA LA POSICION LOCALIZADA
			}
		} while (i < array.length && !localizado);

		return i;
	}

	/**
	 * Método esNull, recibe un String por parámetro y comprueba si esa cadena es
	 * vacía
	 * 
	 * @param String cadena, con el dato tipo String tecleado por el usuario
	 * @return boolean esNull,
	 *         <ul>
	 *         <li>true: si la cadena es vacía</li>
	 *         <li>false: si la cadena contiene datos</li>
	 *         </ul>
	 */
	public static boolean esNull(String cadena) {// METODO PARA REVISAR QUE EL STRING NO SEA VACIO
		boolean esNull = true; // INICIALIZAMOS CADENA COMO VACIA/NULA
		if (cadena != null && cadena.length() > 0) { // SI LA CADENA NO ES NULA NI VACIA
			esNull = false; // MODIFICAMOS VARIABLE A FALSE PARA QUE SALGA DEL BUCLE
		}
		return esNull; // RETORNA FALSE SI NO ES NULA NI VACIA
	}

	/**
	 * Método validaString, recibe un String por parámetro y limpia la cadena de
	 * espacios
	 * 
	 * @param String cadena, con el dato tipo String tecleado por el usuario
	 * @return String retorno, con la cadena tecleada por el usuario, libre de
	 *         espacios
	 */
	public static String validaString(String cadena) {// METODO PARA LIMPIAR LOS ESPACIOS
		String retorno = "";
		if (!esNull(cadena)) { // SI LA CADENA NO ES NULA NI VACIA
			retorno = cadena.trim(); // LIMPIA LOS ESPACIOS
		}
		return retorno; // DEVULEVE LA CADENA LIMPIA DE ESPACIOS
	}

	/**
	 * Método anioValido, recibe un dato tipo int y valida si es un año coherente:
	 * mínimo 1968, año de la primera serie de coches en el mercado, máximo el año
	 * actual
	 * 
	 * @param int anio, recibe el año tecleado por el usuario
	 * @return boolean anioValido,
	 *         <ul>
	 *         <li>true: si el año es correcto</li>
	 *         <li>false: si el año es incoherente</li>
	 *         </ul>
	 */
	public static boolean anioValido(int anio) {// METODO PARA VALIDAR EL AÑO
		boolean anioValido = true;

		if (anio < 1968 || anio > 2022) { // VALIDAR QUE EL AÑO SEA COHERENTE CON LA PRIMERA SERIE DE COCHES
			System.out.println("Teclee año en formato aaaa");
			anioValido = false;
		}
		return anioValido;
	}

	/**
	 * Método buscaCoche, recibe el array de coches y un dato String con un dato.
	 * Busca dentro del array si existe el dato.
	 * 
	 * @param String[] arCoche, contiene los datos de los coches existentes
	 * @param String   cocheBuscar, con la información tecleada por el usuario
	 * @return int iPosicion, con la posición del coche dentro del array
	 */
	public static int buscaCoche(String[] arCoche, String cocheBuscar) {

		int iPosicion = -1; // POSICION DEL ARRAY DONDE ESTA EL MODELO, -1 SINO ESTA
		int j = 0;

		do {
			if (arCoche[j] != null && arCoche[j].equalsIgnoreCase(cocheBuscar)) {
				iPosicion = j;// SI ES LOCALIZADO DEVOLVERA SU POSICION
				j = arCoche.length; // LA j LLEGA A LA ULTIMA POSICION PARA NO CONTINUAR
			} else {
				j++;// SINO SE INCREMENTA UNA POSICION
			}
		} while (j < arCoche.length && iPosicion <= -1);

		return iPosicion;

	}

	/**
	 * Método dimeModelo, solicita al usuario el dato del modelo y valida que el
	 * dato no sea vacío.
	 * 
	 * @return String modelo, con el dato String del modelo
	 */
	public static String dimeModelo() {// PREGUNTAR MODELO DEL COCHE HASTA QUE EL DATO SEA CORRECTO
		String modelo;

		do {
			System.out.println("Introduzca nombre del modelo...");
			modelo = Util.validaString(sc.next().toString()); // VALIDA QUE LA CADENA NO SEA VACIA
		} while (modelo.length() == 0);
		sc.nextLine();// LIMPIO EL OBJETO SCANNER PARA ABSORBER EL INTRO

		return modelo;
	}

	/**
	 * Método dimeSerie, solicita al usuario el dato de la serie y valida que el
	 * dato no sea vacío.
	 * 
	 * @return String serie, con el dato String de la serie
	 */

	public static String dimeSerie() {// PREGUNTAR SERIE DEL COCHE HASTA QUE EL DATO SEA CORRECTO
		String serie;

		do {
			System.out.println("Introduzca nombre de la serie...");
			serie = Util.validaString(sc.next().toString());// VALIDA QUE LA CADENA NO SEA VACIA
		} while (serie.length() == 0);
		sc.nextLine();// LIMPIO EL OBJETO SCANNER PARA ABSORBER EL INTRO

		return serie;
	}

	/**
	 * Método dimeAnio, solicita al usuario el dato tipo int con el año y valida que
	 * sea coherente.
	 * 
	 * @return int anio, con el dato tipo int de año
	 */

	public static int dimeAnio() {// PREGUNTAR EL AÑO HASTA QUE SEA VALIDO
		int anio;

		do {
			System.out.println("Introduzca año del modelo..");
			while (!sc.hasNextInt()) {
				System.out.println("Introduzca año del modelo en formato yyyy");
				sc.next();
			}
			anio = sc.nextInt();
		} while (!Util.anioValido(anio));

		return anio;
	}

	/**
	 * Método aniadete, recibe los tres arrays, los tres datos validados a
	 * introducir en cada array respectivamente y la primera posición vacía del
	 * array en la que hay que añadir los datos.
	 * 
	 * 
	 * @param arModelo2,   array con la información de los modelos
	 * @param stModeloAux, dato String con la información del modelo a almacenar
	 * @param arSerie2,    array con la información de las series
	 * @param stSerieAux,  dato String con la información de la serie a almacenar
	 * @param arAnio2,     array con la información de los años
	 * @param inAnioAux,   dato String con la información del modelo a almacenar
	 * @param i2,          dato tipo int con la primera posición vacía de los
	 *                     arrays.
	 */
	public static void aniadete(String[] arModelo2, String stModeloAux, String[] arSerie2, String stSerieAux,
			int[] arAnio2, int inAnioAux, int i2) { // METODO PARA AÑADIR VALORES EN LOS ARRAYS

		arModelo2[i2] = stModeloAux;
		arSerie2[i2] = stSerieAux;
		arAnio2[i2] = inAnioAux;

	}

	/**
	 * Método muestrameCoche, recibe los tres arrays y una posición, e imprime los
	 * datos tabulados de esa posición.
	 * 
	 * @param arModelo2, array con la información de los modelos
	 * @param arSerie2,  array con la información de las series
	 * @param arAnio2,   array con la información de los años
	 * @param i,         dato tipo int con una posición de los arrays
	 */
	public static void muestrameCoche(String[] arModelo2, String[] arSerie2, int[] arAnio2, int i) { // IMPRIME COCHE

		System.out.println(arModelo2[i] + ", " + arSerie2[i] + ", " + arAnio2[i]);

	}

	/**
	 * Método muestrameCochexAnios, que muestra la información de los coches entre
	 * dos fechas indicadas por el usuario.
	 * 
	 * @param arModelo2,   array con la información de los modelos
	 * @param arSerie2,    array con la información de las series
	 * @param arAnio2,     array con la información de los años
	 * @param inBuscarMin, dato tipo int con la información del año mínimo
	 * @param inBuscarMax, dato tipo int con la información del año máximo
	 */
	public static void muestrameCochexAnios(String[] arModelo2, String[] arSerie2, int[] arAnio2, int inBuscarMin,
			int inBuscarMax) { // IMPRIME LOS COCHES QUE CUMPLAN CRITERIO AÑOS

		// RECORRE EL ARRAY DE AÑOS CON BUCLE FOR
		// DEVUELVE LOS DATOS DE LOS TRES ARRAYS SI ENTRA EN EL RANGO

		for (int i = 0; i < arAnio2.length; i++) {
			if (arAnio2[i] != 0) { // SI EL AÑO NO ES VACIO ENTRA
				if (arAnio2[i] >= inBuscarMin && arAnio2[i] <= inBuscarMax) { // SI EL AÑO ESTA DENTRO DEL RANGO
					muestrameCoche(arModelo2, arSerie2, arAnio2, i);
				}
			}
		}
	}

	/**
	 * Método validaDuplicados, para eliminar los objetos duplicados cuando se
	 * muestran todos los coches en una lista.
	 * 
	 * @param stArray, array con la información de los modelos
	 * @return String[] arModeloAuxiliar, con los modelos existentes, sin duplicados
	 */
	public static String[] validaDuplicados(String[] stArray) { // RELLENA A VACIOS LAS POSICIONES DUPLICADAS DE UN
																// ARRAY

		String[] arModeloAuxiliar = new String[stArray.length]; // ARRAY AUXILIAR PARA LIMPIAR LOS DUPLICADOS
		// METODO DE LA CLASE ARRAY QUE HACE UNA COPIA DEL ARRAY
		// EN UNA ZONA DIFERENTE DE MEMORIA (HASH CODE)
		arModeloAuxiliar = (String[]) stArray.clone();

		for (int i = 0; i < arModeloAuxiliar.length; i++) {// RECORRE EL ARRAY DESDE LA POSICION 0

			for (int j = 0; j < (arModeloAuxiliar.length - 1); j++) {// RECORRE EL ARRAY COMPARANDO LA POSICION 0 CON
																		// TODAS

				if (i != j) { // SI LAS DOS POSICIONES SON DIFERENTES ENTRA A COMPARAR SU VALOR
					if (arModeloAuxiliar[i] != null && arModeloAuxiliar[i].equals(arModeloAuxiliar[j])) { // SI EL VALOR
																											// ES IGUAL
						arModeloAuxiliar[j] = ""; // BORRA LA POSICION DEL ELEMENTO DUPLICADO
					}
				}
			}
		}
		return arModeloAuxiliar; // RETORNA EL MISMO ARRAY STRING PERO CON VACIOS SI EL VALOR ESTA REPETIDO
	}

	/**
	 * Método burbujaArrayInt, para ordenar los coches por años y mostrar el
	 * resultado tabulado.
	 * 
	 * @param array,   array con la información de los años
	 * @param modelos, array con la información de los modelos
	 * @param series,  array con la información de las series
	 */
	public static void burbujaArrayInt(int[] array, String[] modelos, String[] series) { // BURBUJA PARA ORDENAR ARRAY
																							// NUMEROS
		int i, j, auxMenor, auxMayor; // DECLARAMOS VARIABLES AUXILIARES PARA CAMBIAR LOS VALORES
		String modeloAuxMayor, modeloAuxMenor, serieAuxMayor, serieAuxMenor;

		for (i = 0; i < array.length; i++) { // RECORRER ARRAY COMPARANDO POSICION i CONTRA TODAS PARA ORDENAR
			for (j = 0; j < array.length - 1; j++) { // COMPARAR CONTRA TODAS LAS POSICIONES

				if (array[j] > array[j + 1]) { // SI LA POSICION ANTERIOR ES MAYOR QUE LA SIGUIENTE SE CAMBIAN
					// ALMACENAMOS VALORES EN VARIABLES AUXILIARES
					auxMayor = array[j];
					auxMenor = array[j + 1];
					// INTERCAMBIAMOS LOS VALORES
					array[j] = auxMenor;
					array[j + 1] = auxMayor;
					// REPETIMOS CON LOS OTROS ARRAYS PARA NO PERDER LOS INDICES
					modeloAuxMayor = modelos[j];
					modeloAuxMenor = modelos[j + 1];

					modelos[j] = modeloAuxMenor;
					modelos[j + 1] = modeloAuxMayor;

					serieAuxMayor = series[j];
					serieAuxMenor = series[j + 1];

					series[j] = serieAuxMenor;
					series[j + 1] = serieAuxMayor;
				}
			}
		}

		for (int k = 0; k < array.length; k++) {// OTRO BUCLE PARA IMPRIMIR LAS POCICIONES CUANDO ESTE ORDENADO
			if (array[k] != 0) { // SI LA POSICION DEL ARRAY NO ES VACIA
				muestrameCoche(modelos, series, array, k); // MUESTRA LOS DATOS DEL COCHE
			}
		}
	}

	/**
	 * Método numeroElementos, para mostrar en todo momento las posiciones libres
	 * dentro de los arrays e informar al usuario si puede seguir almacenando o debe
	 * eliminar.
	 * 
	 * @param array,    recibe uno de los arrays como parámetro
	 * @param longitud, dato tipo int con la longitud máxima de almacenamiento de
	 *                  los arrays.
	 */
	public static void numeroElementos(String[] array, int longitud) { // MUESTRA LOS ELEMENTOS DISPONIBLES EN LA
																		// COLECCION
		int ocupadas = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != null && !array[i].equalsIgnoreCase("")) { // SI NO ES NULA O VACIA
				ocupadas++; // SE INCREMENTA CONTADOR DE POSICIONES OCUPADAS
			}
		}
		System.out.println(
				"Hay " + ocupadas + " elementos en la colección y " + (longitud - ocupadas) + " posiciones vacías");
	}
}
