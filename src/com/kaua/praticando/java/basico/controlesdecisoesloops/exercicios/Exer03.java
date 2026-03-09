package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios;

import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu sexo(F/M):");
		String sexo = sc.nextLine().toUpperCase();
		
		if(sexo.equals("F")) {
			System.out.println("F - Feminino");
		}else if (sexo.equals("M")) {
			System.out.println("M - Masculino");
		}else {
			System.out.println("Sexo Invalido.");
		}
		
		sc.close();
	}
}
