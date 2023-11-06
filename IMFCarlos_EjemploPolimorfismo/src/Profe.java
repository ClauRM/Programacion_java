
public class Profe extends Persona {
	
	private String centro;

	public Profe(String nombre, int edad, String centro) {
		super(nombre, edad);
		this.centro = centro;
	}

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	@Override
	public String toString() {
		return "Profe [centro=" + centro + "]";
	}
	
	

}
