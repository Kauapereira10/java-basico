package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== CAIXA ELETRÔNICO ====");
		System.out.print("Qual valor você quer sacar (R$ 10 - R$ 600)? ");
		int valor = sc.nextInt();
		
		if(valor > 10 && valor <= 600) {
			
			int nota100 = valor / 100;
			valor %= 100;
			
			int nota50 = valor / 50;
			valor %= 50;
			
			int nota10 = valor / 10;
			valor %= 10;
			
			int nota5 = valor / 5;
			valor %= 5;
			
			int nota1 = valor / 1;
			valor %= 1;
			
			if(nota100 > 0 ) {System.out.println(nota100 + " notas de 100");};
			if(nota50 > 0 ) {System.out.println(nota50 + " notas de 50");};
			if(nota10 > 0 ) {System.out.println(nota10 + " notas de 10");};
			if(nota5 > 0 ) {System.out.println(nota5 + " notas de 5");};
			if(nota1 > 0 ) {System.out.println(nota1 + " notas de 1");};
		} else {
			System.out.println("Valor tem que ser maior que 10 e menor que 600.");
		}
		
		sc.close();
	}
	
}
