package com.kaua.praticando.java.basico.programacaobasica.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite suas 4 notas: ");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		double nota4 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A média da sua nota é " + media);
		sc.close();
	}
}
