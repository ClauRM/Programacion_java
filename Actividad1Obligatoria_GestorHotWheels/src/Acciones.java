/**
 * 
 * <h2>Clase Acciones, se utiliza para ejecutar las acciones del men� principal
 * del programa gestor</h2>
 * 
 * @author claudia rubio
 * @version 03-2022
 *
 */
public class Acciones {

	/**
	 * Longitud de los arrays
	 */
	private static int longitud = 20; // LONGITUD DE TODOS LOS ARRAYS

	/**
	 * Declaraci�n del array de String arModelo, almacena modelos de los coches
	 */
	public static String[] arModelo = new String[longitud];

	/**
	 * Declaraci�n del array de String arSerie, almacena serie de los coches
	 */
	public static String[] arSerie = new String[longitud];

	/**
	 * Declaraci�n del array de String arAnio, almacena anio de los coches
	 */
	public static int[] arAnio = new int[longitud];

	/**
	 * Metodo ejemploInsert(), no recibe par�metros y se utiliza para a�adir datos
	 * de prueba
	 */
	public static void ejemploInsert() { // INSERTAR VALORES DE PRUEBA
		arModelo[0] = "MUSTANG";
		arSerie[0] = "CLASICOS";
		arAnio[0] = 1987;

		arModelo[1] = "LUIGIKART";
		arSerie[1] = "MARIOBROS";
		arAnio[1] = 2015;

		arModelo[2] = "CHEVROLET";
		arSerie[2] = "F15";
		arAnio[2] = 1968;

		arModelo[3] = "BATMOBILE";
		arSerie[3] = "BATMAN";
		arAnio[3] = 2021;

		arModelo[4] = "CAMARO";
		arSerie[4] = "SWEET16";
		arAnio[4] = 1969;

		arModelo[5] = "MARIOKART";
		arSerie[5] = "MARIOBROS";
		arAnio[5] = 2015;

		arModelo[6] = "CHEVROLET";
		arSerie[6] = "F15";
		arAnio[6] = 1968;

	}

	/**
	 * M�todo opcion1Aniadir(), no recibe par�metros y ejecuta la opci�n 1 del men�
	 * principal
	 * 
	 * Primero, valida si hay espacio dentro de los arrays. Si hay espacio, solicita
	 * y valida los datos Modelo, Serie y A�o para a�adir un nuevo modelo al gestor
	 * de coches Al finalizar, muestra los datos que se han a�adido
	 */
	public static void opcion1Aniadir() { // METODO QUE EJECUTA LA OPCION 1

		int iNew; // POSICION EN ARRAY
		String stModeloAux, stSerieAux = null;
		int inAnioAux = 0;

		iNew = Util.posicionNullArray(arModelo); // i BUSCA LA PRIMERA POSICION NULL DEL ARRAY

		// VALIDAR SI i ES MAYOR QUE LA LONGITD DE LOS ARRAYS
		if (iNew >= longitud) {
			System.out.println("� No hay m�s espacio. Debe eliminar o modificar un coche �");
		} else {// PIDE MODELO, SERIE Y A�O
			stModeloAux = Util.dimeModelo();
			stSerieAux = Util.dimeSerie();
			inAnioAux = Util.dimeAnio();

			// A�ADE CADA DATO A SUS RESPECTIVOS ARRAYS
			Util.aniadete(arModelo, stModeloAux, arSerie, stSerieAux, arAnio, inAnioAux, iNew);

			// MUESTRA LOS DATOS A�ADIDOS
			Util.muestrameCoche(arModelo, arSerie, arAnio, iNew);

		}

	}

	/**
	 * M�todo opcion2Modificar(), no recibe par�metros y ejecuta la opci�n 2 del
	 * men� principal
	 * 
	 * Antes de modificar, verifica si el array tiene datos. Si los tiene, muestra
	 * todos los modelos y solicita el modelo a modificar. Pregunta y valida los
	 * datos del modelo y los muestra por consola al finalizar
	 */
	public static void opcion2Modificar() {// METODO QUE EJECUTA LA OPCION 2

		String stModeloMod;
		String stNuevoModelo, stNuevaSerie;
		int inNuevoAnio;

		int iMod = 0; // POSICION EN EL ARRAY

		// VALIDA QUE HAYA DATOS EN EL ARRAY MODELO
		if (arModelo == null) {
			System.out.println("� No hay ning�n modelo. No puede modificar �");
		} else {
			// MUESTRA LOS MODELOS Y PREGUNTA CUAL QUIERE MODIFICAR
			opcion8MostrarTodo();
			System.out.println("Qu� modelo desea modificar?...");
			stModeloMod = Util.validaString(Util.sc.next().toString());

			// METODO QUE BUSCA EL MODELO TECLEADO DENTRO DEL ARRAY Y DEVUELVE SU POSICION
			// -1 SI NO LO HA LOCALIZADO
			iMod = Util.buscaCoche(arModelo, stModeloMod);

			// SI NO LO LOCALIZA INFORMA QUE NO ESTA
			if (iMod < 0) {
				System.out.println("No se ha localizado el modelo");
			} else { // PREGUNTA LOS DATOS NUEVOS
				stNuevoModelo = Util.dimeModelo();
				stNuevaSerie = Util.dimeSerie();
				inNuevoAnio = Util.dimeAnio();

				// INCLUYE LOS DATOS NUEVOS EN LA POSICION
				Util.aniadete(arModelo, stNuevoModelo, arSerie, stNuevaSerie, arAnio, inNuevoAnio, iMod);

				// MUESTRA LOS NUEVOS DATOS
				Util.muestrameCoche(arModelo, arSerie, arAnio, iMod);

			}
		}
	}

	/**
	 * M�todo opcion3Eliminar(), no recibe par�metros y ejecuta la opci�n 3 del men�
	 * principal
	 * 
	 * Antes de eliminar, verifica si el array tiene datos. Si los tiene, muestra
	 * todos los modelos y solicita el modelo a eliminar.
	 * 
	 */
	public static void opcion3Eliminar() {// METODO QUE EJECUTA LA OPCION 3

		String stModeloElim = null;
		int iElim;
		String eliminar;

		// VALIDA QUE HAYA DATOS EN EL ARRAY MODELO
		if (arModelo == null) {
			System.out.println("� No hay ning�n modelo. No puede eliminar �");
		} else {
			// MUESTRA LOS MODELOS Y PREGUNTA CUAL QUIERE ELIMINAR
			opcion8MostrarTodo();
			System.out.println("Qu� modelo desea eliminar?...");
			stModeloElim = Util.validaString(Util.sc.next().toString());

			// BUSCAR EL DATO EN EL ARRAY Y DEVUELVE SU POSICION, -1 SINO ESTA
			iElim = Util.buscaCoche(arModelo, stModeloElim);

			if (iElim < 0) { // SI NO LO LOCALIZA LO INDICA
				System.out.println("No se ha localizado el modelo");
			} else {
				// PREGUNTA SI ESTA SEGURO?
				System.out.println("Est� seguro que desea eliminar el modelo " + stModeloElim + "? S/N...");
				eliminar = Util.sc.next().toString();
				do {
					switch (eliminar) {
					case "S": // SI LA RESPUESTA ES SI REEMPLAZAMOS LA POSICION CON NULL
						Util.aniadete(arModelo, null, arSerie, null, arAnio, 0, iElim);
						System.out.println("Los modelos que tienes ahora son: ");
						opcion8MostrarTodo();
						break;
					case "N": // SI LA RESPUESTA ES NO SALE
						System.out.println("Mantenemos el modelo " + stModeloElim);
						break;
					default:
						System.out.println("Escriba S si desea eliminar, o N si desea mantener");
						break;
					}
				} while (eliminar == "S");

			}
		}
	}

	/**
	 * M�todo opcion4BuscarCoche(), no recibe par�metros y ejecuta la opci�n 4 del
	 * men� principal
	 * 
	 * Pregunta el dato por el que desea buscar: Modelo, Serie o A�o. Valida los
	 * datos y devuelve el resultado o indica que no se localiza.
	 * 
	 */
	public static void opcion4BuscarCoche() {// METODO QUE EJECUTA LA OPCION 4

		String stTipoDato;
		String stBuscar;
		int inBuscarMin, inBuscarMax;
		int iBus;

		System.out.println("�Qu� dato desea buscar?: MODELO, SERIE o A�O");// QUE DESEA BUSCAR
		stTipoDato = Util.sc.next().toString();

		switch (stTipoDato.toUpperCase()) {// BUSCAR DATO EN LA MATRIZ CORRESPONDIENTE EN MAYUSCULA
		case "MODELO":
			stBuscar = Util.dimeModelo(); // PREGUNTA MODELO Y VALIDA EL DATO
			iBus = Util.buscaCoche(arModelo, stBuscar); // DEVUELVE LA POSICION EN EL ARRAY, -1 SINO ESTA
			if (iBus < 0) { // SINO ESTA SE INDICA
				System.out.println("El modelo no existe");
			} else { // SI ESTA, MOSTRAR LOS TRES DATOS DE LA POSICION
				Util.muestrameCoche(arModelo, arSerie, arAnio, iBus);
			}
			break;
		case "SERIE":
			stBuscar = Util.dimeSerie(); // PREGUNTA MODELO Y VALIDA EL DATO
			iBus = Util.buscaCoche(arSerie, stBuscar); // DEVUELVE LA POSICION EN EL ARRAY, -1 SINO ESTA
			if (iBus < 0) { // SINO ESTA SE INDICA
				System.out.println("La serie no existe");
			} else { // SI ESTA, MOSTRAR LOS TRES DATOS DE LA POSICION
				Util.muestrameCoche(arModelo, arSerie, arAnio, iBus);
			}
			break;
		case "A�O":
			System.out.println("Desde qu� a�o desea buscar?");
			inBuscarMin = Util.dimeAnio(); // PREGUNTA A�O MIN Y VALIDA EL DATO
			System.out.println("Hasta qu� a�o desea buscar?");
			inBuscarMax = Util.dimeAnio(); // PREGUNTA A�O MAX Y VALIDA EL DATO
			// RECORRE EL ARRAY DE A�OS CON BUCLE FOR
			// DEVUELVE LOS DATOS DE LOS TRES ARRAYS SI ENTRA EN EL RANGO
			Util.muestrameCochexAnios(arModelo, arSerie, arAnio, inBuscarMin, inBuscarMax);
			break;
		default:
			System.out.println("�Error. No existe ese dato.�");
			break;
		}
	}

	/**
	 * M�todo opcion5ListarModelos(), no recibe par�metros y ejecuta la opci�n 5 del
	 * men� principal
	 * 
	 * Muestra los datos existentes en el array arModelo.
	 * 
	 */
	public static void opcion5ListarModelos() { // METODO QUE EJECUTA LA OPCION 5

		String[] arModeloAuxiliar = new String[longitud];

		arModeloAuxiliar = Util.validaDuplicados(arModelo);// METODO QUE DEVUELVE ARRAY CON VACIOS SI HAY DUPLICADOS
		// UTILIZAMOS ARRAY AUXILIAR PARA NO MODIFICAR EN ARRAY ORIGINAL

		System.out.println("Listado por Modelos:");

		for (int i = 0; i < arModeloAuxiliar.length; i++) {
			if (arModeloAuxiliar[i] != null && arModeloAuxiliar[i] != "") {// IMPRIME DATOS QUE NO SE CONSIDEREN NULOS
				System.out.println(arModeloAuxiliar[i]);
			}
		}
	}

	/**
	 * M�todo opcion6ListarSeries(), no recibe par�metros y ejecuta la opci�n 6 del
	 * men� principal
	 * 
	 * Muestra los datos existentes en el array arSerie.
	 * 
	 */
	public static void opcion6ListarSeries() {// METODO QUE EJECUTA LA OPCION 6

		String[] arSerieAuxiliar = new String[longitud]; // arr rcibe sin duplicados
		String[] arrAuxSeries = arSerie; // se envia a validar

		System.out.println("Listado por Series:");

		int contador = 0;
		int[] arNumeroElementos = new int[arSerie.length]; // ARRAY AUXILIAR PARA ALMACENAR LAS REPETICIONES

		// LOCALIZAMOS EL NUMERO DE VECES QUE SE REPITE UNA SERIE
		for (int i = 0; i < arrAuxSeries.length; i++) { // RECORRE EL ARRAY DESDE LA POSICION 0
			for (int j = 0; j < arrAuxSeries.length; j++) { // RECORRE EL ARRAY COMPARANDO LA POSICION 0 CON TODAS
				if (arrAuxSeries[i] != null && arrAuxSeries[i].equalsIgnoreCase(arrAuxSeries[j])) {
					contador++; // INCREMENTAMOS CONTADOR A CADA VUELTA SI SON IGUALES
				}
			}
			arNumeroElementos[i] = contador; // AL FINALIZAR ALMACENAMOS EL CONTADOR EN EL ARRAY AUXILIAR
			contador = 0; // RESETEAMOS CONTADOR PARA LA SIGUIENTE POSICION
		}
		arSerieAuxiliar = Util.validaDuplicados(arrAuxSeries); // METODO QUE DEVUELVE ARRAY CON VACIOS SI HAY DUPLICADOS
		// UTILIZAMOS VARIABLE AUXILIAR PARA NO MODIFICAR ARRAY ORIGINAL

		// CUANDO TENEMOS LA MATRIZ SIN DUPLICADOS, SE IMPRIME LA SERIE Y EL NUMERO DE
		// VECES QUE SE REPITE
		for (int i = 0; i < arSerieAuxiliar.length; i++) { // RECORREMOS EL ARRAY SERIE
			if (arSerieAuxiliar[i] != null && arSerieAuxiliar[i] != "") { // SI LOCALIZA UNA POSICION DIFERENTE DE
																			// VACIOS LA IMPRIME
				System.out.println("Serie: " + arSerieAuxiliar[i] + " --> tiene " + arNumeroElementos[i] + " coches");
			} else {
				i++;
			}
		}
	}

	/**
	 * M�todo opcion7ListarAniosOrdenado(), no recibe par�metros y ejecuta la opci�n
	 * 7 del men� principal
	 * 
	 * Muestra los datos existentes en el array arAnio, ordenados de menor a mayor.
	 * 
	 */
	public static void opcion7ListarAniosOrdenado() {// METODO QUE EJECUTA LA OPCION 7

		Util.burbujaArrayInt(arAnio, arModelo, arSerie);// METODO DE LA BURBUJA PARA ORDENAR ARRAYS DE NUMEROS
	}

	/**
	 * M�todo opcion8MostrarTodo(), para mostrar la informaci�n contenida en los
	 * tres arrays.
	 */
	public static void opcion8MostrarTodo() {
		for (int i = 0; i < longitud; i++) {
			if (arModelo[i] != null && !arModelo[i].equalsIgnoreCase("")) { // SI NO ES NULA O VACIA
				Util.muestrameCoche(arModelo, arSerie, arAnio, i); // SE MUESTRAN LOS DATOS
			}
		}
	}

	/**
	 * M�todo muestraNumeroElementos(), para mostrar el n�mero de posiciones vac�as
	 * y disponibles para seguir almacenando en los arrays.
	 */
	public static void muestraNumeroElementos() {
		Util.numeroElementos(arModelo, longitud);
	}
}
