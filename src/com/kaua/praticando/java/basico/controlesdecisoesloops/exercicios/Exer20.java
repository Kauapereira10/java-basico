package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota:");
		double nota1 = sc.nextDouble();
		System.out.println("Digite sua segunda nota:");
		double nota2 = sc.nextDouble();
		System.out.println("Digite sua terceira nota:");
		double nota3 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if(media == 10) {
			System.out.println("Sua média foi: " + media);
			System.out.println("Aprovado com Distinção");
	 	} else if(media >= 7) {
			System.out.println("Sua média foi: " + media);
			System.out.println("Aprovado");
		} else {
			System.out.println("Sua média foi: " + media);
			System.out.println("Reprovado");
		}
		
		sc.close();
	}
	
}
