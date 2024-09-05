package aula07.exercicios;

import java.util.Objects;
import java.util.Scanner;

public class LetraMaiusculaMinuscula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("VOCÊ DESEJA CONVERTER SUA FRASE PARA MAIÚSCULO OU MINÚSCULO ?");
        System.out.println(".Digite 1 para converter minúsculo para  MAIÚSCULO");
        System.out.println(".Digite 2 para converter MAIÚSCULO para  Minúsculo");
        String opcao = scanner.nextLine();
        if (!Objects.equals(opcao, "1") && !Objects.equals(opcao, "2")) {
            System.out.println("opção invalida");
            return;
        }

        System.out.println("Digite sua frase:");
        String frase = scanner.nextLine();
        String conversao = "";

        if (opcao.equals("1")) {
            conversao = frase.toUpperCase();

        } else {
            conversao = frase.toLowerCase();

        }

        scanner.close();
        System.out.println("A frase convertida é: " + conversao);

    }

}


