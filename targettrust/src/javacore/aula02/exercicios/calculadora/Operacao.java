package javacore.aula02.exercicios.calculadora;

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

    public int multiplicacao() {
        return 8 * 6;
    }

    public void imprime() {
        System.out.println(somar(5, 9));
        System.out.println(subtracao(3, 7));
        System.out.println(divisao(3, 9));
        System.out.println(multiplicacao());
    }


}
