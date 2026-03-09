package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios;

import java.util.Scanner;

public class Exer02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor = sc.nextInt();
		
		if(valor > 0) {
			System.out.println("O valor " + valor + " é positovo.");
		}else if (valor < 0) {
			System.out.println("O valor " + valor + " é negativo.");
		}else {
			System.out.println("O valor e zero.");
		}
		
		sc.close();
	}
}
