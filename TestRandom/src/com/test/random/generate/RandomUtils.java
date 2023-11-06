package com.test.random.generate;

import java.util.Random;

public class RandomUtils {

	private Random random = new Random();
	

	public int getDia() {
        int randomDia = 0 + random.nextInt((32 - 0) + 1);

		return randomDia;
	}


	public int getMes() {
		int randomMes = 0 + random.nextInt((13 - 0) + 1);
		return randomMes;
	}

	

	public int getAnio() {
		int anio = 2000 + random.nextInt((2023 - 2000) + 1);;
		return  anio;
	}

	
	
}
