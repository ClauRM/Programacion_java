
public class Profesor {

	private String nombreprofesor;
	private String asignatura;


	public Profesor() {
		super();
	}

	public Profesor(String nombreprofesor, String asignatura) {
		super();
		this.nombreprofesor = nombreprofesor;
		this.asignatura = asignatura;
	}

	public String getNombreprofesor() {
		return nombreprofesor;
	}

	public void setNombreprofesor(String nombreprofesor) {
		this.nombreprofesor = nombreprofesor;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Profesor [nombreprofesor=" + nombreprofesor + ", asignatura=" + asignatura + "]";
	}



}
