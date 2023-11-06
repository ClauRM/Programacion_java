import java.util.Scanner;

public class Utilidades {
	
	
	public static void mostrar(String dato) {
		System.out.println(dato);
		
	}
	
	public static void mostrar(int dato) {
		System.out.println(dato);
		
	}
	
	public static int pedirNumero(String texto,int inicio, int fin) {
		
		int valor=0;
		Scanner lector= new Scanner(System.in);
		
		do {
			System.out.println(texto);
			valor=lector.nextInt();
		}while(valor<inicio || valor>fin);
		
		return valor;
				
	}
	
	
	
	

}
