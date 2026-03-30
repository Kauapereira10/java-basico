package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer14 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota:");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite sua segunda nota:");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		String aproveitamento = "";
		
		if(media >= 9.0 && media <= 10.0) {
			aproveitamento = "A";
		} else if (media >= 7.5 && media < 9.0) {
			aproveitamento = "B";
		} else if (media >= 6.0 && media < 7.5) {
			aproveitamento = "C";
		} else if (media >= 4.0 && media < 6.0) {
			aproveitamento = "D";
		} else {
			aproveitamento = "E";
		}
		
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + aproveitamento);
		
		switch (aproveitamento) {
		case "A": 
		case "B": 
		case "C": System.out.println("Aprovado"); break;
		case "D": 
		case "E": System.out.println("Reprovado"); break;
		}
		
		sc.close();
	}
}
