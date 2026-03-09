package com.kaua.praticando.java.basico.controlesdecisoesloops.controle;

import java.util.Scanner;

public class ExemploBreak {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 3: ");
        int opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Você escolheu a opção 1");
                // break;
                // O break encerra este case e impede que os próximos
                // cases sejam executados automaticamente.

            case 2:
                System.out.println("Você escolheu a opção 2");
                break;

            case 3:
                System.out.println("Você escolheu a opção 3");
                break;

            default:
                System.out.println("Opção inválida");
        }

        sc.close();
    }
}