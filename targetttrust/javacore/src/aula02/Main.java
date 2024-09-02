package javacore.aula02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo a cálculadora ");
        System.out.println("Qual tipo de calculo você deseja fazer ?");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");

        Scanner entrada = new Scanner(System.in);
        Integer opcao = entrada.nextInt();
//        Integer opcao = 0;
//        try{
//            opcao = entrada.nextInt();
//        }catch (InputMismatchException exception) {
//            System.out.println("Valor inválido, digite um número");
//        }
        Minhacalculadora cal = new Minhacalculadora();
        if (opcao == 1) {

            System.out.println("Opção escolhida foi a soma ");
            ValorDigitado valorDigitado = lervalores();
            Integer resultado = cal.soma(valorDigitado.valorA, valorDigitado.valorB);
            System.out.println("Resultado : " + resultado);


        } else if (opcao == 2) {
            System.out.println("Opção escolhida foi a subtração ");
            ValorDigitado valorDigitado = lervalores();
            Integer resultado = cal.subtrair(valorDigitado.valorA, valorDigitado.valorB);
            System.out.println("Resultado : " + resultado);
        } else {
            System.out.println("Opção inválida, favor digite novamente");
        }



//        Minhacalculadora cal = new Minhacalculadora();
//        int somatoria = cal.soma(5,9);
//        System.out.println(somatoria);
//        int diminuicao = cal.subtrair(45,26);
//        System.out.println(diminuicao);


    }

    private static ValorDigitado lervalores() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite o primeiro valor.");
            Integer valorA = sc.nextInt();
            System.out.println("Digite o segundo valor valor. ");
            Integer valorB = sc.nextInt();

            ValorDigitado valorDigitado = new ValorDigitado(valorA, valorB);
            return valorDigitado;

    }


}
