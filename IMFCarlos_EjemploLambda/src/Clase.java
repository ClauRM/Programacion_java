
public abstract class Clase {
	
	private String dato;

	public Clase(String dato) {
		super();
		this.dato = dato;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	@Override
	public String toString() {
		return "Clase [dato=" + dato + "]";
	}
	
	public abstract void mostrar();

}
