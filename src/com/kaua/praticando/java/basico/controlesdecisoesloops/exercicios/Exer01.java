package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios;

import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int num1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero:");
		int num2 = sc.nextInt()	;	
		
		if(num1 > num2) {
			System.out.println("O primeiro numero " + num1 + " é maior que o segundo numero " + num2); 
		}else {
			System.out.println("O segundo numero " + num2 + " é maior que o primeiro numero " + num1); 
		}
				
		sc.close();
	}
}
