package aula04.switchcase;

import java.util.Scanner;

public class SwitchMultiplo {
    public static void main(String[] args) {

        // estação do ano

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero que corresponde a um mês");
        int mes = sc.nextInt();

        String estacao;
        switch (mes) {
            case 1:
            case 2:
            case 12:
                //System.out.println("verão");
                estacao = "Verão";
                break;
            case 3:
            case 4:
            case 5:
                //System.out.println("Outono");
                estacao = "Outono";
                break;
            case 6:
            case 7:
            case 8:
                //System.out.println("Inverno");
                estacao = "Inverno";
                break;
            case 9:
            case 10:
            case 11:
                //System.out.println("Primavera");
                estacao = "Primavera";
                break;
            default:
                //System.out.println("Opção Inválida");
                estacao = "Mês Inválido";

        }
        System.out.println("Estação do ano: " + estacao);

        sc.close();
    }
}
