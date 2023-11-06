import java.util.ArrayList;

public class Claustro {

	private String nombrecentro;

	// DECLARO ARRAYLIST PARA ALMACENAR PROFESORES EN EL CLAUSTRO
	static ArrayList<Profesor> profesores = new ArrayList<>();

	
	public Claustro() {
		super();
	}

	public Claustro(String nombrecentro) {
		super();
		this.nombrecentro = nombrecentro;
	}

	public String getNombrecentro() {
		return nombrecentro;
	}

	public void setNombrecentro(String nombrecentro) {
		this.nombrecentro = nombrecentro;
	}

	@Override
	public String toString() {
		return "Claustro [nombrecentro=" + nombrecentro + "]";
	}

	// METODO PARA AÑADIR PROFESORES A LA LISTA DE PROFESORES
	public static void aniade(String nombreprofesor, String nombreasignatura) {
		profesores.add(new Profesor(nombreprofesor, nombreasignatura));

	}

	// MOSTRAR TODOS LOS PROFESORES DEL CLAUSTRO
	public static void muestra() {
		for (int i = 0; i < profesores.size(); i++) {
			System.out.println(profesores.toString());
		}
	}

}
