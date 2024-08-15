package com.targettrust.loop.whileDoWhile;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner banco = new Scanner(System.in);

        double saldoInicial, desposito = 0;
        double saque;

        System.out.println("Favor Inserir um saldo inicial para sua conta :");
        saldoInicial = banco.nextDouble();
        System.out.println("Seu saldo inicial é : " + saldoInicial);

        int opcao;

        do {
            System.out.println("Voce deseja fazer um depósito ou saque ?");
            System.out.println("Digite 1. para deposito:");
            System.out.println("Digite 2. para saque:");
            System.out.println("Digite 0 para sair:");
            opcao = banco.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do depósito:");
                    desposito = banco.nextDouble();
                    saldoInicial += desposito;
                    System.out.println("Depósito realizado com sucesso. Seu saldo atual é: " + saldoInicial);
                    break;

                case 2:
                    System.out.println("Digite o valor do saque:");
                    saque = banco.nextDouble();
                    if (saque <= saldoInicial) {
                        saldoInicial -= saque;
                        System.out.println("Saque realizado com sucesso. Seu saldo atual é: " + saldoInicial);
                    } else {
                        System.out.println("Saldo insuficiente para realizar o saque.");
                    }
                    break;

                case 0:
                    System.out.println("Você saiu da sua Conta, até breve.");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }


        } while (opcao != 0);

        banco.close();

    }
}

