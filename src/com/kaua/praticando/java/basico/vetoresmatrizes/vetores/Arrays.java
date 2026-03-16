package com.kaua.praticando.java.basico.vetoresmatrizes.vetores;

public class Arrays {
	public static void main(String[] args) {
		
		double[] temp = new double[365];
		temp[0] = 22.3;
		temp[1] = 33.3;
		temp[2] = 29.3;
		temp[3] = 30.3;
		temp[4] = 38.3;
		
		System.out.println("Temperatura do dia 1 é " + temp[0]);
		
		System.out.println("O tamanho do Array é " + temp.length);
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println("Temperatura do dia " + (i + 1) + " é: " + temp[i]);
		}
		
		System.out.println();
		
		for (double temperatura : temp) {
			System.out.println(temperatura);
		}
	}
}
