package com.kaua.praticando.java.basico.programacaobasica.variaveis;

public class VariaveisChar {

    public static void main(String[] args) {

        /*
         * TIPO CHAR
         * Armazena um único caractere.
         * Sempre usa aspas simples: ' '
         */

        // Letras
        char letraA = 'A';
        char letraB = 'B';

        // Número como caractere (não é número inteiro!)
        char numero = '7';

        // Espaço
        char espaco = ' ';

        // Símbolos
        char simbolo = '@';

        // Caractere especial (quebra de linha)
        char quebraDeLinha = '\n';

        /*
         * Também podemos usar o código Unicode
         * (cada caractere possui um número correspondente)
         */
        char unicodeCoracao = '\u2764'; // ❤
        char unicodeLetra = 65; // Código 65 = 'A'

        System.out.println("Letra A: " + letraA);
        System.out.println("Letra B: " + letraB);
        System.out.println("Número (char): " + numero);
        System.out.println("Símbolo: " + simbolo);
        System.out.println("Unicode coração: " + unicodeCoracao);
        System.out.println("Unicode 65: " + unicodeLetra);

        System.out.println(quebraDeLinha + "Texto após quebra de linha");
    }
}