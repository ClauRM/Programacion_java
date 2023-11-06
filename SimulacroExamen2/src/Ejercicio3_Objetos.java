
public class Ejercicio3_Objetos {

	public static void main(String[] args) {
		
		// OBJETO DE LA CLASE PROFESOR
		Profesor profesor = new Profesor();
		
		// OBJETO DE LA CLASE CLAUSTRO
		Claustro claustro = new Claustro();
		
		// AÑADO PROFESORES AL CLAUSTRO
		Claustro.aniade("María", "Lenguaje");
		Claustro.aniade("Mario", "Matemáticas");
		
		//MUESTRO TODOS LOS PROFESORES DEL CLAUSTRO
		Claustro.muestra();

	}

}
