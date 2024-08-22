package aula03.exercicios.array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            // Solicita nota e armazenadas no Array(notas)
        double[] notas = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        sc.close();

            // Soma as notas do Array
        double soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += notas[i];
        }

        // Calcula a média aritmética
        double media = soma / 3;

        System.out.println("Notas armazenadas:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        System.out.println("Média aritmética: " + media);
        if (media >= 7){
            System.out.println("situação: Aprovado");
        }else {
            System.out.println("Situação: Reprovado");
        }
    }
}
