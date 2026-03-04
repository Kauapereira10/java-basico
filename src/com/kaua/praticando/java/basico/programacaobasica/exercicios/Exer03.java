package com.kaua.praticando.java.basico.programacaobasica.exercicios;

import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 numeros: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int soma = num1 + num2;
		
		System.out.println("A soma do num1 + num2 = " + soma);
 		
		sc.close();
	}
}
