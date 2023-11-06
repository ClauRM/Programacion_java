import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Caso4_restaFechas {

	public static void main(String[] args) {
		/*
		 * Sobre el caso anterior. Pedimos la fecha actual con día, mes y año. Mostramos
		 * la edad del usuario en años. Cuidado que no se trata simplemente de restar
		 * los años.
		 */

		String fechaNac = null; // VARIABLE PARA RECIBIR EL RETURN ANTERIOR

		fechaNac = Caso3_fechaNacimiento.dameFechaNac(); // INSTANCIO EL MAIN DEL CASO ANTERIOR PARA EJECUTAR EL PROG

		dimeEdad(fechaNac);

	}

	public static void dimeEdad(String fechaNac) { // METODO PARA CONOCER LA EDAD

		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");// OBJETO QUE DARA FORMATO A LAS FECHAS

		// 1 FORMATEAR FECHA HOY
		Date dtHoy = new Date();// DEVUELVE FECHA DEL SISTEMA Y ALMACENA EN VARIABLE TIPO DATE
		formatoFecha.format(dtHoy);// FORMATEAMOS EL "DTHOY" CON EL FORMATO DEL OBJETO FORMATOFECHA

		// 2 CONVETIR STRING A TIPO DATE PARA RESTAR FECHAS - OBLIGA A USAR TRY-CATCH
		try {
			Date dtFechaNac = formatoFecha.parse(fechaNac); // CONVIERTE STRING EN DATE

			int diferencia = dtHoy.getYear() - dtFechaNac.getYear(); // CONVERTIR LAS FECHAS EN AÑOS Y RESTAR
			// LA DIFERENCIA SE ALMANECA EN UN ENTERO

			System.out.println("Tienes " + diferencia + " años");

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
