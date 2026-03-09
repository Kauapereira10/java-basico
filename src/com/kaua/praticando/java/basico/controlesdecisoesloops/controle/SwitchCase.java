package com.kaua.praticando.java.basico.controlesdecisoesloops.controle;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Me fale o numero do dia da semana:");
		int diaSemana = sc.nextInt();
		
		switch (diaSemana) {
		case 1: 
			System.out.println("Hoje é Domingo");
			break;
		case 2: 
			System.out.println("Hoje é Segunda");
			break;
		case 3: 
			System.out.println("Hoje é Terça-Feira");
			break;
		case 4: 
			System.out.println("Hoje é Quarta-Feira");
			break;
		case 5: 
			System.out.println("Hoje é Quinta-Feira");
			break;
		case 6: 
			System.out.println("Hoje é Sexta-Feira");
			break;
		case 7: 
			System.out.println("Hoje é Sabado-Feira");
			break;
		default:
			System.out.println("Nao é um dia da semana válido!");
		}
		
		
		
		sc.close();
	}
}
