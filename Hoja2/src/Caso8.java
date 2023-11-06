import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		/*
		 * Un almacén realiza un descuento del 40% si se compran más de 100 unidades
		 * de un mismo artículo; un 20% si se compran entre 25 y 100 unidades y un 10%
		 * si se compran entre 10 y 24 unidades. Escribir un programa que pregunte el
		 * precio de un artículo y la cantidad comprada y calcule e informe del total a
		 * pagar así como del descuento aplicado.
		 */

		float precio;
		int cantidad;
		float descuento;

		Scanner sc = new Scanner(System.in);

		System.out.println("Indique el precio del artículo:");
		precio = sc.nextFloat();

		System.out.println("Cantidad comprada:");
		cantidad = sc.nextInt();

		if (cantidad > 100) {
			descuento = precio*cantidad - precio*cantidad * 40 / 100;
			System.out.println("El total a pagar es " + descuento + " eur, tras aplicar un 40% de descuento");
		} else if (cantidad >= 25 && cantidad <= 100) {
			descuento = precio*cantidad - precio*cantidad * 20 / 100;
			System.out.println("El total a pagar es " + descuento + " eur, tras aplicar un 20% de descuento");
		} else if (cantidad >= 10 && cantidad < 25) {
			descuento = precio*cantidad - precio*cantidad * 10 / 100;
			System.out.println("El total a pagar es " + descuento + " eur, tras aplicar un 10% de descuento");
		} else {
			System.out.println("El total a pagar es " + precio*cantidad + " eur, sin aplicar ningún descuento");
		}

	}

}
