package com.targettrust.parimpar;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número : ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Numero é Par");
        } else {
            System.out.println("Numero é Impar");
        }
        scanner.close();


    }


}

