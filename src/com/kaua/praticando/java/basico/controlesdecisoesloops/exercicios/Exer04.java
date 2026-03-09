package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios;

import java.util.Scanner;

public class Exer04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma letra:");
		String letra = sc.nextLine().toUpperCase();
		
		if(letra.equals("A") || letra.equals("B") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
			System.out.println("A letra " + letra + " é vogal.");
		}else {
			System.out.println("É uma consoante.");
		}
		
		sc.close();
		
	}
}
