package com.targettrust.controledefluxo.switchcase;

import java.util.Scanner;

public class ConverterValores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Escreva um programa que converta um valor em reais para uma das seguintes moedas: dólar, euro ou libra. O usuário deve escolher a moeda e informar o valor em reais
        System.out.println("Escolha a moeda para conversão: ");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Libra");
        int opcao = sc.nextInt();

        System.out.println("Informe o valor em reais: ");
        double valorEmReais = sc.nextDouble();

        double valorConvertido;

        switch (opcao) {
            case 1:
                valorConvertido = valorEmReais / 5.5;
                System.out.println("Valor em dólar: " + valorConvertido);
                break;
            case 2:
                valorConvertido = valorEmReais / 6.5;
                System.out.println("Valor em euro: " + valorConvertido);
                break;
            case 3:
                valorConvertido = valorEmReais / 7.5;
                System.out.println("Valor em libra: " + valorConvertido);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        sc.close();

    }
}
