package com.kaua.praticando.java.basico.programacaobasica.operadores;

public class OperadoresLogicos {
	public static void main(String[] args) {
		
		int idade = 20;
        boolean temCarteira = true;
        boolean temMulta = false;
        boolean ehEstudante = true;
        boolean ehFuncionario = false;

        // && (E)
        boolean podeDirigir = idade >= 18 && temCarteira;

        // || (OU)
        boolean precisaRevisao = temMulta || idade < 18;

        // ! (NÃO)
        boolean estaRegular = !temMulta;

        // ^ (OU Exclusivo) Retorna true se apenas uma for verdadeira
        boolean descontoEspecial = ehEstudante ^ ehFuncionario;

        // Misturando todos
        boolean situacaoFinal = (idade >= 18 && temCarteira) && !temMulta && (ehEstudante ^ ehFuncionario);

        System.out.println("Pode dirigir: " + podeDirigir);
        System.out.println("Precisa revisão: " + precisaRevisao);
        System.out.println("Está regular: " + estaRegular);
        System.out.println("Desconto especial: " + descontoEspecial);
        System.out.println("Situação final aprovada: " + situacaoFinal);
		
	}
}
