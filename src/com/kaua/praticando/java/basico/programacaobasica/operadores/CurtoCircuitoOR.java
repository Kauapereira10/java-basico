package com.kaua.praticando.java.basico.programacaobasica.operadores;

public class CurtoCircuitoOR {
	public static void main(String[] args) {
		
		int y = 10;

		// || faz curto-circuito (pode não executar a segunda parte)
        // | não faz curto-circuito (sempre executa as duas partes)
		
        boolean resultado1 = (y < 5) || (++y > 0);

        System.out.println("Resultado1: " + resultado1);
        System.out.println("Valor de y: " + y);
        
        boolean resultado2 = (y < 5) | (++y < 0);

        System.out.println("Resultado2: " + resultado2);
        System.out.println("Valor de y: " + y);
	}
}
