package aula08.wrapper.exercicios;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("favor digitar um numero inteiro :");
        int num = sc.nextInt();

        Integer result = num % 2;

        if (result == 0) {
            System.out.println("O número " + num + " é par");
        } else {
            System.out.println("o número " + num + " é impar");
        }
        sc.nextInt();

    }
}
