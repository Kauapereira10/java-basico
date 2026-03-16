package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios;

import java.util.Scanner;

public class Exer10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Em qual turno voce estuda");
		String turno = sc.next().toUpperCase();
		
		switch (turno) {
		case "MATUTINO": 
			System.out.println("Bom Dia!");
			break;
		case "VESPERTINO": 
			System.out.println("Boa Tarde!");
			break;
		case "NOTURNO": 
			System.out.println("Boa Noite!");
			break;
		default:
			System.out.println("Valor Invalido");
		}
		
		sc.close();
	}
}
