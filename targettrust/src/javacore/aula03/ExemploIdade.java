package javacore.aula03;

import java.util.Scanner;

public class ExemploIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual sua idade ?");
        int idade = entrada.nextInt();
        System.out.println("Você é PCD ?");
        System.out.println("1-sim / 2-não");
        int opcao = entrada.nextInt();

        if ((idade <= 12 || idade >= 60) && opcao == 1) {
            System.out.println("Você tem direito a benefícios especiais.");
        }else{
            System.out.println("Você não tem direito aos benefícios especiais");
        }

        entrada.close();
    }
}
