
public class Ejercicio2_Objetos {

	public static void main(String[] args) {
		/*
		 * Ejercicio 2: Mediante m�todos no est�ticos (con objetos de clases). Realiza
		 * una llamada desde una clase externa. Creamos un objeto de tipo Calificaci�n
		 * que tiene atributos asignatura (String) y nota (int). Al pasar ese objeto a
		 * un m�todo debe devolver la nota (<5 � Suspenso, >5 y <7 � Aprobado, <7 y <9 �
		 * notable, >9 � sobresaliente).
		 */

		Calificacion calificacion = new Calificacion("Base Datos", 9);

		// METODO QUE CONVIERTE LA NOTA NUMERICA EN TEXTO
		Calificacion.devuelvenota(calificacion);

	}

}
