package com.kaua.praticando.java.basico.programacaobasica.lendodados;

import java.util.Locale;
import java.util.Scanner;

public class LendoDadosTeclado2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem pets: ");
		String primeiroNome = sc.next();
		int idade = sc.nextInt();
		byte qtdFilhos = sc.nextByte();
		float altura = sc.nextFloat();
		boolean temPet = sc.nextBoolean();
		
		System.out.println("Voce digitou os seguintes valores:");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade : " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem pet? " + temPet);
		
		sc.close();
	}
}
