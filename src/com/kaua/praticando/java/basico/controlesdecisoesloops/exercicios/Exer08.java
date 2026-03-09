package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Preco do primeiro produto:");
		double prod1 = sc.nextDouble();
		System.out.println("Preco do segundo produto:");
		double prod2 = sc.nextDouble();
		System.out.println("Preco do terceiro produto:");
		double prod3 = sc.nextDouble();
		
		if(prod1 < prod2 && prod1 < prod3) {
			System.out.println("Vou comprar este produto de R$ " + prod1 + " é o maior");
		}else if (prod2 < prod1 && prod2 < prod3) {
			System.out.println("Vou comprar este produto de R$ " + prod2 + " é o maior");
		}else if (prod3 < prod1 && prod3 < prod2){
			System.out.println("Vou comprar este produto de R$ " + prod3 + " é o maior");
		}else {
			System.out.println("Preco tudo igual");
		}
		
		
		sc.close();
	}
}
