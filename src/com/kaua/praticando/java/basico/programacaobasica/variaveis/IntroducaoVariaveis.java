package com.kaua.praticando.java.basico.programacaobasica.variaveis;

public class IntroducaoVariaveis {

    public static void main(String[] args) {

        /*
         * ===============================
         * DECLARAÇÃO DE VARIÁVEIS
         * ===============================
         */

        // Variáveis seguindo a convenção Java (camelCase)
        int idade = 20;
        String nome = "Carlos";
        String nomeDoCachorro = "Rabito";

        /*
         * camelCase:
         * - Primeira palavra começa com letra minúscula
         * - Próximas palavras começam com letra maiúscula
         * Exemplo: nomeCompleto
         */
        String nomeCompleto = "Carlos Silva";

        /*
         * ===============================
         * NOMES PERMITIDOS (MAS NÃO RECOMENDADOS)
         * ===============================
         */

        // Java permite iniciar com _ ou $
        int _idade = 25;
        int $salario = 3000;

        // Pode conter números (não pode começar com número)
        String ano2014 = "Copa do Mundo";

        /*
         * ===============================
         * MÁS PRÁTICAS DE NOMEAÇÃO
         * ===============================
         */

        // Não é padrão Java usar underline para variáveis comuns
        String nome_do_meu_cachorro = "Bolt";

        // Variável começando com letra maiúscula (parece nome de classe)
        String NomeDoMeuCachorro = "Max";

        // Difícil leitura por erro de capitalização
        String nomeDoMeucachorro = "Thor";

        // Nomes sem significado (evite isso)
        int a = 10;
        String n = "Miguel";

        /*
         * ===============================
         * IMPRIMINDO VALORES
         * ===============================
         */

        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);
        System.out.println("Nome do Cachorro: " + nomeDoCachorro);
        System.out.println("Nome Completo: " + nomeCompleto);

    }
}