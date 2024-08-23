package aula05;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {

    public static void main(String[] args) {
        // Criar um programa que peça ao usuário para adivinhar um número entre 1 e 100.
        // O programa deve continuar solicitando uma tentativa até que o usuário adivinhe
        // o número corretamente.
/*        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número entre 1 e 100
        int tentativa = 0;
        int palpite = 0;

        System.out.println("Adivinhe o número entre 1 e 100:");

        // Loop while para continuar pedindo palpites até acertar
        while (palpite != numeroAleatorio) {
            System.out.println("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativa++;

            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior que " + palpite + ". Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor que " + palpite + ". Tente novamente.");
            }
        }
        System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + " em " + tentativa + " tentativas.");
        scanner.close();*/



        int numero = 1;

        // Loop while para imprimir números de 1 a 10
        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }


    }


}
