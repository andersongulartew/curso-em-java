package com.targettrust.controledefluxo.exemplo;


import java.util.Scanner;

public class ExemploControleFluxo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do arquivo: ");
        double numero = sc.nextDouble();

        if (numero > 0) {
            System.out.println("O número é positivo");
        } else if (numero < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é zero");
        }

        sc.close();
    }


}



