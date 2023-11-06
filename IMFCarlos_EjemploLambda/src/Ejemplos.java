import java.net.DatagramPacket;
import java.util.ArrayList;

public class Ejemplos {

	public static void main(String[] args) {
		// LAMBDAS: https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html#approach6
		// INTERFACES FUNCIONALES: https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
		//PRECIDATE y CONSUMER: https://programmerclick.com/article/768297854/	
		
		ArrayList<Integer> datos= new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			datos.add(i);
		}
		
		//ejecutar una función para cada elemento con Consumer (interface funcional)
		datos.forEach(dato -> System.out.println(dato));
		
		//stream recoje todos los elementos de la estructura
		//ejecutar una función para filtrar cada elemento con Predicate (interface funcional)
		datos.stream().filter(notas -> notas>=5 && notas<8).forEach(listado -> System.out.println(listado));
		
		/*enlaces recomendados*/
		//https://www.arteco-consulting.com/introduccion-a-java-lambda/
		//https://www.adictosaltrabajo.com/2015/12/04/expresiones-lambda-con-java-8/
	}

}
