
public class Profesor extends Empleado implements Distancia {

	// clase profesor extiende de empleado e implementa una interfaz

	private String asignatura;
	private int horas;

	public Profesor(String nombre, float sueldo, String asignatura, int horas) {
		super(nombre, sueldo);
		this.asignatura = asignatura;
		this.horas = horas;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Profesor [asignatura=" + asignatura + ", horas=" + horas + "]";
	}

	public void fichar() {
		// no se necesita implementarlo a no ser que se pida en el examen
	}

	@Override
	public void conectar() {
		// la clase profesor obliga a implementar el metodo conectar de la interfaz
		// sobre el error de la clase - implementar metodos
		// o con boton derecho - Source - implementar metodos

	}

}
