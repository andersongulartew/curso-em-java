package com.targettrust.loop.whileDoWhile;

import java.util.Scanner;

public class MenuRestaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String escolha;

        do {
            System.out.println("1. opcao 1");
            System.out.println("2. opcao 2");
            System.out.println("3. sair");
            System.out.println("Escolha uma opção");
            escolha = sc.next();

            switch (escolha) {
                case "1":
                    System.out.println("Escolheu opcao 1");
                    break;
                case "2":
                    System.out.println("Escolheu opcao 2");
                    break;
                case "3":
                    System.out.println("Saindo do programa");
                    break;
                default:
                    System.out.println("Escolha inválida, tente novamente");

            }

        } while (!escolha.equals("3"));
        sc.close();
    }
}
