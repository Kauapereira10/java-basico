package com.kaua.praticando.java.basico.programacaobasica.operadores;

public class CurtoCircuitoAND {
	public static void main(String[] args) {
		
		int x = 10;
		
		// Se a primira parte for true ele executa a segunda parte, se nao, ele nao executa
		boolean resultado1 = (x < 5) &&	(++x > 0);
		
		System.out.println("Resultado1: " + resultado1);
		System.out.println("Valor de x: " + x);
		
		// Indepedente do resultado sempre e considerado o primeiro
		boolean resultado2 = (x > 5) & (++x > 0);
		
		System.out.println("Resultado2: " + resultado2);
		System.out.println("Valor de x: " + x);
		
	}
}
