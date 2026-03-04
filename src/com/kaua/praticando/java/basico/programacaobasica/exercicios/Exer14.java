package com.kaua.praticando.java.basico.programacaobasica.exercicios;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quanto você ganha por hora: ");
        double valorPorHora = sc.nextDouble();

        System.out.print("Digite quantas horas você trabalhou este mês: ");
        double horasMes = sc.nextDouble();

        double salarioBruto = valorPorHora * horasMes;

        // Exemplo: desconto de 8% de INSS
        double inss = salarioBruto * 0.08;

        double salarioLiquido = salarioBruto - inss;

        System.out.println("\n===== FOLHA DE PAGAMENTO =====");
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto INSS (8%): R$ " + inss);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        sc.close();
    }
}