import java.security.cert.CertPathValidator;
import java.util.ArrayList;


public class Centro {
	
	private ArrayList<Persona> listado=new ArrayList<Persona>();
	private int sumaEdad=0;

	public Centro() {
		super();
	}

	@Override
	public String toString() {
		return "Centro [listado=" + listado + "]";
	}

	public ArrayList<Persona> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Persona> listado) {
		this.listado = listado;
	}
	
	public void agregarPersona(Persona miPersona) {
		listado.add(miPersona);
	}
	
	public float verEdad() {
		int total=listado.size();
		int sumaEdad=0;
		//listado.forEach(dato -> {sumar(dato.getEdad());});

		for(Persona dato: listado) {
			sumaEdad+=dato.getEdad();			
		}
		
		return sumaEdad/total;
	}
	
	private void sumar(int edad) {
		
		sumaEdad+=edad;
		
	}
	
	
	

}
