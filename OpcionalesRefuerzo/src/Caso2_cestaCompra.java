import java.util.Scanner;

public class Caso2_cestaCompra {

	public static void main(String[] args) {
		/*
		 * Caso 2: Determina el precio de la compra según el producto y el peso. 250g
		 * 500g 1000g Manzanas 1,5 2 2,7 Mandarinas 3 4 5 Naranjas 5,8 7,2 9,1 El
		 * sistema permitirá comprar varios productos hasta que el usuario decida parar.
		 * Finalmente se mostrará el precio total de la compra.
		 */

		int producto;
		int peso;
		double cesta = 0;
		char continuar;
		boolean salir = false;

		Scanner sc = new Scanner(System.in);

		do {
			// PREGUNTA TIPO DE PRODUCTO
			System.out.println("Producto a comprar: \n1 - Manzanas\n2 - Mandarinas\n3 - Naranjas");
			producto = sc.nextInt();

			// PREGUNTA PESO DEL PRODUCTO
			System.out.println("Peso del producto:\n1 - 250gr\n2 - 500gr\n3 - 1000gr");
			peso = sc.nextInt();

			// CALCULA EL PRECIO
			// SUMA A LA CESTA DE LA COMPRA
			switch (producto) {
			case 1:
				switch (peso) {
				case 1:
					cesta = (cesta + 1.5);
					break;
				case 2:
					cesta = (cesta + 3);
					break;
				default:
					cesta = (cesta + 5.8);
					break;
				}
				break;
			case 2:
				switch (peso) {
				case 1:
					cesta = (cesta + 2);
					break;
				case 2:
					cesta = (cesta + 4);
					break;
				default:
					cesta = (cesta + 7.2);
					break;
				}
				break;
			default:
				switch (peso) {
				case 1:
					cesta = (cesta + 2.7);
					break;
				case 2:
					cesta = (cesta + 5);
					break;
				default:
					cesta = (cesta + 9.1);
					break;
				}
				break;
			}

			// PREGUNTA SI DESEA CONTINUAR
			System.out.println("¿Desea seguir comprando?: S/N");
			continuar = sc.next().charAt(0);

			if (continuar == 'N') {
				salir = true;
			}
		} while (!salir);

		// IMPRIME EL RESULTADO
		System.out.println("TOTAL COMPRA = " + cesta + " EUR");

	}

}
