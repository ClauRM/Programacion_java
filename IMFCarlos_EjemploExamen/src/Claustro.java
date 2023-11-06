import java.util.ArrayList;

public class Claustro {

	private ArrayList<Profesor> profes = new ArrayList<>();
	private String turno;

	public Claustro(ArrayList<Profesor> profes, String turno) {
		super();
		this.profes = profes;
		this.turno = turno;
	}

	public ArrayList<Profesor> getProfes() {
		return profes;
	}

	public void setProfes(ArrayList<Profesor> profes) {
		this.profes = profes;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Claustro [profes=" + profes + ", turno=" + turno + "]";
	}

	public void fichar() {
		// no se pide desarrollar metodo
	}
}
