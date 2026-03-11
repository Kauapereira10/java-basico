package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios2;

import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean notaValida = false;
		
		do {
			System.out.println("Me de uma nota de zero a dez");
			int nota = sc.nextInt();
			
			if(nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Voce digitou: " + nota);
			}else {
				notaValida = false;
				System.out.println("Nota errada, digite novamente!");
			}
		}while(!notaValida);
		
		
		
		
		
	
		sc.close();
	}
}
