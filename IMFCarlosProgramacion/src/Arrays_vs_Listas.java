import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Arrays_vs_Listas {

	public static void main(String[] args) {
		
		String[] claseArray= new String[20];
		ArrayList<String> clase= new ArrayList<String>();
		ArrayList<Integer> bombo=new ArrayList<Integer>();

		//añadir elementos
		claseArray[0]="Pepe";
		clase.add("Pepe");
		
		claseArray[1]="Lola";
		clase.add("Lola");
		
		//mostrar todos elementos
		System.out.println(Arrays.toString(claseArray));
		System.out.println(clase.toString());
		
		//mostrar un elemento
		System.out.println(claseArray[1]);
		System.out.println(clase.get(1));
		
		//buscar una posicion dentro de un ArrayList
		//utilizar el metodo .indexOf()
		//list.indexOf(elemento a buscar);
		//si lo encuentra devolvera un entero con la posicion
		//sino lo encuentra devuelve un numero negativo
		
		//modificar posicion
		claseArray[1]="María";
		clase.set(1, "María");
		
		System.out.println(claseArray[1]);
		System.out.println(clase.get(1));
		
		//borrar, solo en arraylist
		clase.remove(0);
		
		System.out.println(clase.toString());
		
		//llenamos el bombo
		for(int i=1;i<=99;i++) {
			bombo.add(i);
		}
		
		System.out.println(bombo.toString());
		
		//desordenarla
		
		Collections.shuffle(bombo);
		
		System.out.println(bombo.toString());
		
		//sacar 3 números
		
		for(int i=1;i<=3;i++) {
			System.out.println(bombo.get(0));
			bombo.remove(0);
		}

	}

}
