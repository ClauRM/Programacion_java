package com.logica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Utilidades {

	// OBJETO SCANNER
	public static Scanner sc = new Scanner(System.in);

	// METODO PARA VALIDAR SI LA FECHA TIENE FORMATO CORRECTO, RECIBE UN STRING Y
	// DEVUELVE LA FECHA EN LOCALDATE PARA QUE SEA ALMACENADA
	public static LocalDate validaFecha(String fecha) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");// clase y metodo formato fecha
		LocalDate ldFecha = null; // objeto LocalDate
		try {
			ldFecha = LocalDate.parse(fecha, formato);// convierte fecha String en LocalDate segun formato
			// accion peligrosa que obliga a rodear de un try catch
		} catch (DateTimeParseException e) { // excepcion si no se ha podido convertir la fecha
			System.out.println("No se detecta formato fecha dd/mm/aaaa");
		} catch (Exception e) { // excepcion generica para atrapar cualquier otro error
			System.out.println("Error no controlado en la fecha");
		}
		return ldFecha;
	}

	// METODO FORMATEAR FECHA QUE SE RECIBE DEL FICHERO, RECIBE STRING DEVUELVE
	// LOCALDATE
	public static LocalDate formatearFecha(String fecha) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");// clase y metodo formato fecha
		LocalDate ldFecha = null; // objeto LocalDate
		try {
			ldFecha = LocalDate.parse(fecha, formato);// convierte fecha String en LocalDate segun formato
			// accion peligrosa que obliga a rodear de un try catch
		} catch (DateTimeParseException e) { // excepcion si no se ha podido convertir la fecha
			System.out.println("No se detecta formato fecha dd/mm/aaaa");
		} catch (Exception e) { // excepcion generica para atrapar cualquier otro error
			System.out.println("Error no controlado en la fecha");
		}
		return ldFecha;
	}

	// METODO PARA PREGUNTAR FECHA POR CONSOLA, VALIDAR Y GUARDAR EN LOCALDATE
	public static LocalDate dimeFecha() {
		sc = new Scanner(System.in);
		LocalDate ldFecha;

		System.out.println("Indique Fecha de la noticia en formato dd/mm/aaaa:");
		ldFecha = Utilidades.validaFecha(Utilidades.sc.next().toString());// Valida el String fecha y lo convierte a

		Utilidades.sc.nextLine();// limpia buffer scanner

		return ldFecha;
	}

	// METODO PARA SOLICITAR DATO STRING Y ALMANCENARLO EN VARIABLE STRING
	public static String dimeDatoString(String pregunta) {
		sc = new Scanner(System.in);
		String variable = "";

		System.out.println(pregunta);
		variable = Utilidades.sc.nextLine();// guarda el valor tecleado por consola en variable String
		Utilidades.sc.nextLine(); // absorbe el intro

		return variable;
	}

}
