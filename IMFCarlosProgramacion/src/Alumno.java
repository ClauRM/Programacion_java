
public class Alumno extends Persona{
	
	private String ciclo;

	public Alumno(String nombre, int edad, String ciclo) {
		super(nombre, edad);
		this.ciclo = ciclo;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	@Override
	public String toString() {
		return "Alumno [ciclo=" + ciclo + "]";
	}
	

}
