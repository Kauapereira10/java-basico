package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios;

import java.util.Scanner;

public class Exer06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo numero:");
		int num2 = sc.nextInt();
		System.out.println("Digite o terceiro numero:");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O numero " + num1 + " é o maior");
		}else if (num2 > num1 && num2 > num3) {
			System.out.println("O numero " + num2 + " é o maior");
		}else if (num3 > num1 && num3 > num2){
			System.out.println("O numero " + num3 + " é o maior");
		}else {
			System.out.println("Os numeros sao iguais");
		}
		
		sc.close();
	}
}
