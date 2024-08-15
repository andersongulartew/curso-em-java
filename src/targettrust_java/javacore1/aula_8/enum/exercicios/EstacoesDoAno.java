package exercicios.estacoesdoano;

import java.util.Scanner;

public class EstacoesDoAno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe um mes de 1 a 12 para saber qual estação do ano estamos :");
        int mes = entrada.nextInt();
        entrada.close();

        EstacoesDoAnoEnum estacao = determinarEstacao(mes);
        System.out.println("Estação do ano: " + estacao.getNome());
    }

    public static EstacoesDoAnoEnum determinarEstacao(int mes) {
        switch (mes) {
            case 12, 1, 2:
                return EstacoesDoAnoEnum.VERAO;
            case 3, 4, 5:
                return EstacoesDoAnoEnum.OUTONO;
            case 6, 7, 8:
                return EstacoesDoAnoEnum.INVERNO;
            case 9, 10, 11:
                return EstacoesDoAnoEnum.PRIMAVERA;
            default:
                throw new IllegalArgumentException("Mês inválido: " + mes);
        }

    }
}
