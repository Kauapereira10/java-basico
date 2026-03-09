package com.kaua.praticando.java.basico.controlesdecisoesloops.controle;

import java.util.Scanner;

public class IfElseAninhados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Me fala o preço do item:");
		double preco = sc.nextDouble();
		
		if (preco <= 10) {
			System.out.println("Está barato, pode comprar.");
		} else if (preco > 10 && preco < 15) {
			System.out.println("Voce pode pedir um desconto!");
		} else if (preco >= 15 && preco < 17) {
			System.out.println("Pode pesquisar mais.");
		} else { // preco >= 17
			System.out.println("Muito caro");
		}
		
		sc.close();
	}
}
