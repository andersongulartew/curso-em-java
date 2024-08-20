package javacore.aula03.exercicios.calcularIMC;

import java.util.Scanner;

public class imc3 {

    static Scanner sc = new Scanner(System.in);

    public static double getPeso() {
        System.out.println("Digite seu peso : ");
        double peso = sc.nextDouble();
        return peso;
    }

    public static double getAltura() {
        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();
        return altura;
    }

    public static void printClassification(double imc) {
        String classification = "";

        if (imc <= 18.5)
            classification = "Sua Classificação é de Magreza ";
        else if (imc <= 24.9)
            classification = "Sua Classificação Está Dentro do Normal ";
        else if (imc <= 29.9)
            classification = "Sua Classificação é de Sobrepeso I";
        else if (imc <= 39.9)
            classification = "Sua Classificação é Obesidade II";
        else
            classification = "Sua Classificação é Obesidade Grave III";

        System.out.println(classification);
    }

    public static void main(String[] args) {
        double peso = getPeso();
        double altura = getAltura();
        double imc = peso / (altura * altura);
        String resultado = String.format("%.2f", imc);

        System.out.println("Seu IMC é: " + resultado);
        printClassification(imc);

        sc.close();
    }
}
