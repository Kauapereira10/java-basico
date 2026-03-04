package com.kaua.praticando.java.basico.programacaobasica.exercicios;

import java.util.Scanner;

public class Exer02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		
		System.out.println("O número informado foi " + num);
		
		sc.close();
	}
}
