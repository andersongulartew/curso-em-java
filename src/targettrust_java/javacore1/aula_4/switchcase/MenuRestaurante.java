package com.targettrust.controledefluxo.switchcase;

import java.util.Scanner;

public class MenuRestaurante {
    public static void main(String[] args) {

        // menu restaurante

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção de menu");
        System.out.println("1. Pizza");
        System.out.println("----------------");
        System.out.println("2. Hamburguer");
        System.out.println("----------------");
        System.out.println("3. Salada");
        System.out.println("----------------");
        System.out.println("4. Sushi");

        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Sua Escolha foi Pizza");
                break;
            case 2:
                System.out.println("Sua Escolha foi Hambuguer");
                break;
            case 3:
                System.out.println("Sua Escolha foi Salada");
                break;
            case 4:
                System.out.println("Sua Escolha foi Sushi");
                break;

            default:
                System.out.println("Opção Inválida");
        }


    }
}
