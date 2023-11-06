public class DevolucionCambio {

	public static void main(String[] args) {
		/*
		 * cada producto tiene un precio el usuario puede pagar con un billete 500, 200,
		 * 100 , 50 , 20, 10 podemos cubrir el coste del producto calculo el precio -
		 * billete usuario devolver el cambio optimo con valores 200 100 50 20 10 5 2 1€
		 * si dispongo de esas monedas o billetes
		 * 
		 */

		int precio = 2;
		int billete = 100;
		int devolucion;
		int cambio = 0;

		if (precio > billete) {
			System.out.println("No hay dinero suficiente");
		} else {// calcular la devolución

			devolucion = billete - precio;
			do {
				cambio = calcularDevolucion(devolucion);
				System.out.println("Te sale " + cambio);
				devolucion=devolucion - cambio;
			} while (devolucion > 0);

		}

	}

	private static int calcularDevolucion(int devolucion) {

		int[] monedas = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int i = 0;
		boolean continuar = true;

		do {
			if (monedas[i] <= devolucion) {
				// paro
				continuar = false;
			}
			i++;
		} while (i < monedas.length && continuar);

		return monedas[i - 1];

	}

}
