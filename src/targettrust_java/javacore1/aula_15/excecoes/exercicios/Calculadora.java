package exercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o primeiro valor : ");
            double num1 = sc.nextDouble();
            System.out.println("Digite o segundo valor : ");
            double num2 = sc.nextDouble();
            System.out.println("divisão : " + divisao(num1, num2));
            sc.close();

        } catch (Exception e) {
            System.out.println("Erro ao efetuar a divisão");
        }

    }

    public static double divisao(double num1, double num2) {

        if (num2 == 0) {
            String mensagem = "DivisaoPorZeroException";
            throw new DivisaoPorZeroException(mensagem);
        }
        return num1 / num2;


    }
}

