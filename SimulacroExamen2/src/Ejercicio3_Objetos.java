
public class Ejercicio3_Objetos {

	public static void main(String[] args) {
		
		// OBJETO DE LA CLASE PROFESOR
		Profesor profesor = new Profesor();
		
		// OBJETO DE LA CLASE CLAUSTRO
		Claustro claustro = new Claustro();
		
		// A�ADO PROFESORES AL CLAUSTRO
		Claustro.aniade("Mar�a", "Lenguaje");
		Claustro.aniade("Mario", "Matem�ticas");
		
		//MUESTRO TODOS LOS PROFESORES DEL CLAUSTRO
		Claustro.muestra();

	}

}
