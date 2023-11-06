
public class Gestion {

	public static void main(String[] args) {
		
		Centro imfCentro=new Centro();
		Persona pepeAlumno=new Alumno("pepe", 18, "DAM");
		Persona lolaAlumno=new Alumno("lola", 19, "DAW");
		Persona carlosProfe=new Profe("Carlos", 31, "IMF");
		
		imfCentro.agregarPersona(pepeAlumno);
		imfCentro.agregarPersona(lolaAlumno);
		imfCentro.agregarPersona(carlosProfe);
		
		System.out.println(imfCentro.verEdad());
		

	}

}
