package com.kaua.praticando.java.basico.programacaobasica.exercicios;

import java.util.Scanner;

public class Exer09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Farenheit: ");
		double farenheit = sc.nextDouble();
		
		double celsius =(5 * (farenheit-32) / 9);
		
		System.out.println("Temperatura em Celsus " + celsius);
		
		sc.close();
	}
}
