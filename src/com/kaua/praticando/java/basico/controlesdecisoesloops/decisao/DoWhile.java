package com.kaua.praticando.java.basico.controlesdecisoesloops.decisao;

public class DoWhile {
	public static void main(String[] args) {
		
		int numero = 1;

        // Executa enquanto numero for menor ou igual a 5
        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero <= 5);

        System.out.println("Fim do loop. Valor final: " + numero);
        
        System.out.println();
        
        int numero2 = 10;

        do {
            System.out.println("Executou uma vez, numero = " + numero2);
        } while (numero2 < 5);

        System.out.println("Programa finalizado.");
	}
}
