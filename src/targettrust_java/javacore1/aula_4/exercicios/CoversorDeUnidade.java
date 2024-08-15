package com.targettrust.controledefluxo.switchcase;

import java.util.Scanner;

public class CoversorDeUnidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Unidade :");
        System.out.println("Converte de Celsius para Fahrenheit _ Digite 1");
        System.out.println("Converte de Fahrenheit para Celsius _ Digite 2");
        System.out.println("Converter KM em Milhas _ Digite 3");
        System.out.println("Converter Milhas em KM _ Digite 4");
        int opcao = sc.nextInt();



        switch (opcao) {
            case 1: {
                System.out.println("Digite os graus Celsius: ");
                double Celsius = sc.nextDouble();
                double conversao = (Celsius * 9 / 5) + 32;
                System.out.println("A conversão de Celsiu em Fahrenheit é: " + String.format("%.2f" , conversao) + " Fahrenheit");
                break;
            }
            case 2: {
                System.out.println("Digite os graus Fahrenheit: ");
                double Fahrenheit = sc.nextDouble();
                double conversao = (Fahrenheit - 32) /1.8;
                System.out.println("A conversão de Fahrenheit em Celsius é: " + String.format("%.2f" , conversao) + " Celsius");
                break;
            }
            case 3: {
                System.out.println("Digite os KM: ");
                double KM = sc.nextDouble();
                double conversao = (KM * 0.621371);
                System.out.println("A conversão de KM em Milhas é: " + String.format("%.2f", conversao) + " Milhas");
                break;
            }
            case 4: {
                System.out.println("Digite as milhas: ");
                double Milhas = sc.nextDouble();
                double conversao = (Milhas * 1.60934);
                System.out.println("A conversão de Milhas em KM é: " + String.format("%.2f", conversao) + " KM");
                break;
            }
            default:{
                System.out.println("Valor Inválido");
            }


        }
        sc.close();
    }
}
