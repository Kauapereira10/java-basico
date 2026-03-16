package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios;

import java.util.Scanner;

public class Exer09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero:");
		int num1 = sc.nextInt();
		
		System.out.println("Informe o segundo numero:");
		int num2 = sc.nextInt();
		
		System.out.println("Informe o terceiro numero:");
		int num3 = sc.nextInt();
		
		
		if(num1 >= num2 && num1 >= num3) {
			if(num2 >= num3) {
				System.out.println("[" +num1 + ", " + num2 + ", " + num3 +"]");
			}else {
				System.out.println("[" +num1 + ", " + num3 + ", " + num2 +"]");
			}
				
		}else if (num2 >= num1 && num2 >= num3) {
			if(num1 >= num3) {
				System.out.println("[" +num2 + ", " + num1 + ", " + num3 +"]");
			}else {
				System.out.println("[" +num2 + ", " + num3 + ", " + num1 +"]");
			}
		}else if(num3 >= num1 && num3 >= num2) {
			if(num1 >= num2) {
				System.out.println("[" +num3 + ", " + num1 + ", " + num2 +"]");
			}else {
				System.out.println("[" +num3 + ", " + num2 + ", " + num1 +"]");
			}
		}else {
			System.out.println("Todos sao iguais: [" + num1 + ", " + num2 + ", " + num3 + "]");
		}
		
		sc.close();
	}
}
