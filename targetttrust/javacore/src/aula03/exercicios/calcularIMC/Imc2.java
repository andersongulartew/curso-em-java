package aula03.exercicios.calcularIMC;

import java.util.Scanner;

public class Imc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso : ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        String resultado = String.format("%.2f", imc);
        System.out.println("Seu IMC é: " + resultado);

        if (imc > 0 && imc <= 18.5) {
            System.out.println("Sua Classificação é de Magreza ");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Sua Classificação Está Dentro do Normal ");
        } else if (imc > 24.9 && imc <= 29.9) {
            System.out.println("Sua Classificação é de Sobrepeso I");
        } else if (imc > 29.9 && imc <= 39.9) {
            System.out.println("Sua Classificação é Obesidade II");
        } else {
            System.out.println("Sua Classificação é Obesidade Grave III");
        }

        sc.close();
    }
}
