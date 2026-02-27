package com.kaua.praticando.java.basico.programacaobasica.variaveis;

public class SequenciaEscape {
	public static void main(String[] args) {
		
		/*
		 * SEQUÊNCIAS DE ESCAPE EM JAVA
		 * São usadas dentro de Strings ou char
		 * Sempre começam com barra invertida: \
		 */
		
		// \n -> Nova linha (quebra de linha)
		System.out.println("Linha 1\nLinha 2");
		
		// \t -> Tabulação (espaço de tab)
		System.out.println("Nome:\tCarlos");
		
		// \\ -> Imprime uma barra invertida
		System.out.println("C:\\Users\\Carlos\\Documentos");
		
		// \" -> Imprime aspas duplas dentro da String 
		System.out.println("Ele disse: \"Olá, tudo bem?\"");
		
		// \' -> Imprime aspas simples
		System.out.println("Caractere de aspas simples: \' ");
		
		// \r -> Retorno de carro (sobrescreve parte da linha)
		System.out.println("Texto123\rABC");
		
		// \b -> Backspace (apaga o caractere anterior)
        System.out.println("Texto\bX");
        
        // \f -> Form feed (avanço de página - pouco usado)
        System.out.println("Texto\fNovaPagina");
        
        /*
         * Unicode -> \ u + código hexadecimal
         */
        System.out.println("Coração: \u2764");
        System.out.println("Letra A via Unicode: \u0041");

		
		
	}
}
