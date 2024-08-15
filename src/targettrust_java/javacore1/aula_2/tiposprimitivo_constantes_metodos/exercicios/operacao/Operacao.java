package com.targettrust.calculadora.operacao;


public class Operacao {
    public int somar(int a, int b) {
        return a + b;
    }
    public int subtracao(int a, int b) {
        return a - b;
    }

    public int divisao(int a, int b) {
        return a / b;
    }
     public int multiplicacao(int a, int b) {
        return a * b;
    }


    public void imprime() {
        System.out.println(somar(5, 7));
        System.out.println(subtracao(5, 7));
        System.out.println(divisao(5, 7));
        System.out.println(multiplicacao(5, 7));
    }


}



