
public class Principal {

	public static void main(String[] args) {
		
		
		Utilidades.mostrar("Hola Mundo");

		Utilidades.mostrar(Utilidades.pedirNumero("Introduce un número entre 0 y 10", 0, 10));
		
		System.out.println(Utilidades.pedirNumero("entre 20 y 100", 20, 100));
	}

}
