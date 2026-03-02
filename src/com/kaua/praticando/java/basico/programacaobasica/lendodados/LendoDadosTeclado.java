package com.kaua.praticando.java.basico.programacaobasica.lendodados;

import java.util.Scanner;

public class LendoDadosTeclado {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = sc.nextLine();
		System.out.println("Seu nome completo é " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = sc.next();
		System.out.println("Seu primeiro nome é " + primeiroNome);
		
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		System.out.println("Sua idade é " + idade);
		
		
		System.out.println("Digite sua altura:");
		double altura = sc.nextDouble();
		System.out.println("Sua altura é " + altura);
		
		sc.close();
	}
}
