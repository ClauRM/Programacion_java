import java.util.Random;

public class FechaRandom {

	public int diaR,mesR,anioR; //Variables para almacenar la fecha random
	
	//Objeto de la clase Random para crear las fechas random
	private Random random = new Random();
	
	//Constructor
	public FechaRandom() {
		super();
		this.diaR = dameDia();
		this.mesR = dameMes();
		this.anioR = dameAnio();
	}
	
	//M�todo para generar el d�a random
	public int dameDia() {
		//D�a entre 1 y 31
        int randomDia = 0 + random.nextInt((32 - 0) + 1);
		return randomDia;
	}

	//M�todo para generar el mes random
	public int dameMes() {
		//Mes entre 1 y 12
		int randomMes = 0 + random.nextInt((13 - 0) + 1);
		return randomMes;
	}

	//M�todo para generar el a�o random
	public int dameAnio() {
		//A�o entre el a�o m�nimo de la cartilla de clientes y el a�o actual
		int anio = 1900 + random.nextInt((2023 - 1900) + 1);;
		return  anio;
	}
	

	@Override
	public String toString() {
		return "FechaRandom [dia=" + diaR + "/" + mesR + "/" + anioR + "]";
	}
	
	// M�todo para dise�ar la fecha random
	private static void getFechaRandom() {
		FechaRandom fecharandom = null;
		try {
			fecharandom = new FechaRandom();
		} catch (Exception e) {
			System.out.println("Error en la generaci�n de la fecha random: + " + e);
		}
		System.out.println(fecharandom);

	}
	
}
