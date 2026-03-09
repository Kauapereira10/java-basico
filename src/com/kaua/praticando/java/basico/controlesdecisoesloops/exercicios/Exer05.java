package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota:");
		double nota1 = sc.nextDouble();
		System.out.println("Digite sua segunda nota:");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.out.println("Sua media foi de " + media + ". Aprovado!");
		}else if (media == 10) {
			System.out.println("Sua media foi de " + media + ". Aprovado com Distinçao!");
		}else {
			System.out.println("Sua media foi de " + media + ". Reprovado!");
		}
		 
		sc.close();
	}
}	
