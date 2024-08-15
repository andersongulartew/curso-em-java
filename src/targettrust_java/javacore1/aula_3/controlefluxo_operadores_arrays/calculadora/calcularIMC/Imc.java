package com.targettrust.calculadora.calcularIMC;

import java.util.Scanner;

public class Imc {

    static Scanner sc = new Scanner(System.in);

    public static double Peso() {
        System.out.print("Digite seu peso : ");
        double peso = sc.nextDouble();
        return peso;
    }

    public static double Altura() {
        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();
        return altura;
    }

    public static void main(String[] args) {
        double peso = Peso();
        double altura = Altura();

        double imc = peso / (altura * altura);
        String resultado = String.format("%.2f", imc);
        System.out.println("Seu IMC é: " + resultado) ;

        if (imc <= 18.5) {
            System.out.println("Sua Classificação é de Magreza ");
        } else if (imc <= 24.9) {
            System.out.println("Sua Classificação Está Dentro do Normal ");
        } else if (imc <= 29.9) {
            System.out.println("Sua Classificação é de Sobrepeso I");
        } else if (imc <= 39.9) {
            System.out.println("Sua Classificação é Obesidade II");
        } else {
            System.out.println("Sua Classificação é Obesidade Grave III");
        }

        sc.close();
    }
}



