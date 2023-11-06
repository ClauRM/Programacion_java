package com.test.random.generate;

public class RandomDate {

	
	private int dia, mes, anio;
	private RandomUtils random = new RandomUtils();

	public RandomDate() {
		super();
		this.dia = random.getDia();
		this.mes = random.getMes();
		this.anio = random.getAnio();
	}

	@Override
	public String toString() {
		return "RandomDate [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}

	
	
	
}
