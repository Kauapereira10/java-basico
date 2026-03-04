package com.kaua.praticando.java.basico.programacaobasica.exercicios;

import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quanto você ganha por hora: ");
        double valorPorHora = sc.nextDouble();

        System.out.print("Digite quantas horas você trabalhou no mês: ");
        double horasMes = sc.nextDouble();

        double salarioNoMes = valorPorHora * horasMes;

        System.out.println("Salário final no mês: R$ " + salarioNoMes);

        sc.close();
    }
}