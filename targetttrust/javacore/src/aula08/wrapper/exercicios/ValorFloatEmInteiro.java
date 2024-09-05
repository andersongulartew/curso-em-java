package aula08.wrapper.exercicios;

import java.util.Scanner;

public class ValorFloatEmInteiro {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Favor digitar um valor com virgula : ");
        float valor = num.nextFloat();

        int numero = Math.round(valor);

        System.out.println("O valor inteiro é: " + numero);

        num.close();
    }



}
