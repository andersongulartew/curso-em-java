package com.targettrust.operadoreslogicos;

import java.util.Scanner;

public class ExemploOperadoresLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade : ");
        int idade = scanner.nextInt();

        System.out.println("Você tem CNH ? (true/false) ");
        boolean cnh = scanner.nextBoolean();

        if (idade >= 18 && cnh) {
            System.out.println("Você pode dirigir");
        } else {
            System.out.println("Você não pode dirigir");
        }

        scanner.close();


    }
}
