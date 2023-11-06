

public class Principal {

	public static void main(String[] args) {
		
		//Crear objeto de abstracta
		Clase objetoClase=new Clase("Hola") {
			
			@Override
			public void mostrar() {
				System.out.println("ERROR");
				
			}
		};
		
		//Forma clase anónima
		Mensaje miMensaje=new Mensaje() {
			
			@Override
			public void mostrar(String dato) {
				System.out.println(dato);			
			}
		};
		
		miMensaje.mostrar("Hola Mundo");
		
		//Forma lambda
		Mensaje lMensaje=(tipo)->{System.out.println("digo:" + tipo);};
		
		lMensaje.mostrar(" que pasa ");
	}
	

}
