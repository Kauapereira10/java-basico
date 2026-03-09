package com.kaua.praticando.java.basico.controlesdecisoesloops.controle;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com sua idade");
		int idade = sc.nextInt();
		
		if(idade >= 18) {
			System.out.println("É maior de idade!");
		}else {
			System.out.println("É menor de idade!");
		}
		
		sc.close();
	}
}
