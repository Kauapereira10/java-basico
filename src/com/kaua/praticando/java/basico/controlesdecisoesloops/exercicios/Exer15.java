package com.kaua.praticando.java.basico.controlesdecisoesloops.exercicios;

import java.util.Scanner;

public class Exer15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do triangulo:");
		int lado1 = sc.nextInt();
		
		System.out.println("Digite o segundo lado do triangulo:");
		int lado2 = sc.nextInt();
		
		System.out.println("Digite o terceiro lado do triangulo:");
		int lado3 = sc.nextInt();
		
		if(((lado1 + lado2) > lado3) && ((lado1 + lado3) > lado2) && ((lado2 + lado3) > lado1)) {
			
			if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Triângulo Equilátero");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triângulo Isósceles");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Triângulo Escaleno");
			}
		}else {
			System.out.println("Não Forma um triangulo.");
		}
		
		sc.close();
	}
}
