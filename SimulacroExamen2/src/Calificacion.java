
public class Calificacion {

	private String asignatura;
	private int nota;

	public Calificacion(String asignatura, int nota) {
		super();
		this.asignatura = asignatura;
		this.nota = nota;
	}

	/**
	 * @return the asignatura
	 */
	public String getAsignatura() {
		return asignatura;
	}

	/**
	 * @param asignatura the asignatura to set
	 */
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	/**
	 * @return the nota
	 */
	public int getNota() {
		return nota;
	}

	/**
	 * @param nota the nota to set
	 */
	public void setNota(int nota) {
		this.nota = nota;
	}

	// METODO QUE RECIBE UN OBJETO CALIFICACION ENTERO POR PARAMETRO
	// Y DEVUELVE CALIFICACION EN TEXTO

	public static void devuelvenota(Calificacion calificacion) {
		if (calificacion.getNota() < 0 && calificacion.getNota() > 10) {
			System.out.println(calificacion.getAsignatura() + " -> Error en la nota marcada, debe ser entre 0 y 10");
		} else if (calificacion.getNota() < 5) {
			System.out.println(calificacion.getAsignatura() + " -> Suspenso");
		} else if (calificacion.getNota() >= 5 && calificacion.getNota() < 7) {
			System.out.println(calificacion.getAsignatura() + " -> Aprobado");
		} else if (calificacion.getNota() >= 7 && calificacion.getNota() < 9) {
			System.out.println(calificacion.getAsignatura() + " -> Notable");
		} else if (calificacion.getNota() >= 9) {
			System.out.println(calificacion.getAsignatura() + " -> Sobresaliente");
		}

	}

}
