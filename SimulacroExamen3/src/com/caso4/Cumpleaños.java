package com.caso4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cumpleaños {

	public static void main(String[] args) {

		// clase y metodo formato para el formato fecha
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		// objetos persona para pruebas, con nombre y fecha en LocalDate
		Persona persona = new Persona("Claudia", LocalDate.parse("04/03/1980", formato));
		Persona persona2 = new Persona("Víctor", LocalDate.parse("12/05/1980", formato));

		System.out.println(persona.toString()); // visualizo objeto
		System.out.println(persona2.toString());

		isYourBirthday(persona);
		isYourBirthday(persona2);
	}

	private static void isYourBirthday(Persona persona) {

		LocalDate hoy = LocalDate.now();

		// si el mes es el mismo, entra en la siguiente evaluacion
		if (persona.getFechaNacimiento().getMonth() == hoy.getMonth()) {

			// comprueba si el dia es el mismo
			if (persona.getFechaNacimiento().getDayOfMonth() == hoy.getDayOfMonth()) {
				System.out.println("Feliz cumpleaños " + persona.getNombre());
			}

		} else {
			System.out.println("No es tu cumple " + persona.getNombre());
		}
	}

}
