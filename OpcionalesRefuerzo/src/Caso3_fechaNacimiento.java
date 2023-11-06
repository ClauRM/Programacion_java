import java.time.Year;
import java.util.Scanner;

public class Caso3_fechaNacimiento {

	public static void main(String[] args) {

		dameFechaNac();
		
	}

	
	public static String dameFechaNac() {
		/*
		 * Preguntamos el d�a, mes y a�o de nacimiento del usuario. Mostramos varios
		 * formatos: � ##/##/#### (12/03/2021) � D�a de mes de a�o (12 de marzo de 2021)
		 * � A�o, mes � dia (2021, marzo � doce)
		 */

		// DECLARACION DE VARIABLES

		int dia;
		String diaLet = null;
		int mes;
		String mesLet = null;
		int annoNum;
		String annoLet;
		boolean salir = false;
		int annoActual;
		String fechaNacimiento;

		String[] arrayMesTexto = { "enero", "mes", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };
		String[] arrayDiaTexto = { "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
				"once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve",
				"veinte", "veintiuno", "veintidos", "veintitres", "veinticuatro", "veinticinco", "veintiseis",
				"veintisiete", "veintiocho", "veintinueve", "treinta", "treintayuno" };

		Scanner sc = new Scanner(System.in);

		Year annoSistema = Year.now(); // CLASE YEAR QUE DEVUELVE EL A�O DEL SISTEMA
		annoActual = annoSistema.getValue(); // ALMACENO EL A�O DEL SISTEMA EN LA VARIABLE ENTERA

		do {
			System.out.println("Indique d�a de nacimiento en n�meros:"); // PREGUNTAR DIA Y ALMACENAR DIA
			dia = sc.nextInt();
			if (dia <= 0 || dia >= 32) { // VALIDACION ENTRE 1 Y 31
				System.out.println("Error en la fecha");
			} else {
				salir = true;
			}
		} while (!salir);

		salir = false; // RESETEO VARIABLE DE SALIDA

		do {
			System.out.println("Indique mes de nacimiento en n�meros:"); // PREGUNTAR MES Y ALMACENAR MES
			mes = sc.nextInt();
			if (mes <= 0 || mes >= 13) { // VALIDACION ENTRE 1 Y 31
				System.out.println("Error en el mes");
			} else {
				salir = true;
			}
		} while (!salir);

		salir = false; // RESETEO VARIABLE

		do {
			System.out.println("Indique a�o de nacimiento en n�meros:"); // PREGUNTAR A�O Y ALMACENAR A�O NUMERICO
			annoNum = sc.nextInt(); //
			annoLet = String.valueOf(annoNum); // CONVIERTO A�O EN STRING PARA VALIDAR LONGITUD Y PRIMER CARACTER

			if (annoLet.length() != 4) { // VALIDAR LONGITUD
				System.out.println("Error en el a�o longitud");

			} else if (!annoLet.substring(0, 1).equalsIgnoreCase("1")
					&& !annoLet.substring(0, 1).equalsIgnoreCase("2")) {
				System.out.println("Error en el a�o caracter");

			} else if ((annoActual - annoNum) > 110) { // VALIDAR DIFERENCIA
				System.out.println(annoActual - annoNum);
				System.out.println("Error en el a�o diferencia");

			} else {
				salir = true;
			}
		} while (!salir);

		// MOSTRAR EN FORMATO DD/MM/AAAA
		//validamos dia para concatenar 0
		if (dia < 10) {
			diaLet = "0" + dia;
		}else {
			diaLet = String.valueOf(dia);
		}
		//validamos mes para concatenar 0 
		if (mes < 10) {
			mesLet = "0" + mes;
		}else {
			mesLet =  String.valueOf(mes);
		}
		fechaNacimiento=diaLet + "/" + mesLet + "/" + annoNum;
		System.out.println(fechaNacimiento);

		// MOSTRAR EN FORMATO DD DE MES_LETRAS DE A�O

		System.out.println(diaLet + " de " + arrayMesTexto[mes - 1] + " de " + annoNum);

		// MOSTRAR EN FORMATO A�O, MES_LETRAS - DIA_LETRAS

		System.out.println(annoNum + ", " + arrayMesTexto[mes - 1] + " - " + arrayDiaTexto[dia - 1]);
		
		return fechaNacimiento;
	}
	
	
}
