
/**
 * Esta es la clase Personas, de la cual crearemos los objetos en principal.
 * 
 * Cada objeto será una persona, la cual tendrá 2 atributos: nombre (String) y
 * edad (int).
 * 
 * @author cristianfuertesantas
 * 
 * @see Principal
 */

public class Personas {

	private String nombre;

	private int edad;

	public Personas(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
