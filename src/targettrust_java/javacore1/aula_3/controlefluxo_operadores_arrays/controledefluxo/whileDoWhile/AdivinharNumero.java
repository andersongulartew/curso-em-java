package com.targettrust.loop.whileDoWhile;

import java.util.Random;
import java.util.Scanner;

public class AdivinharNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        int valor = rand.nextInt(10)+1;
        int numeroTentativas = 0;
        boolean acertou = false;

        while (numeroTentativas < 3 && !acertou) {
            numeroTentativas++;
            System.out.println("Digite o valor do chute");
            int valorChute = sc.nextInt();

            if (valorChute == valor) {
                System.out.println("Você acertou!");
                acertou = true;
            } else if (valorChute < valor) {
                System.out.println("Seu chute foi abaixo do valor gerado!");
            } else {
                System.out.println("Seu chute foi acima do valor gerado!");
            }
        }

        if (!acertou) {
            System.out.println("Você errou as 3 tentativas! O valor randômico era: " + valor);
        }


        sc.close();

    }
}
