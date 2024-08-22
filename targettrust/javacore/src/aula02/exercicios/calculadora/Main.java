package javacore.aula02.exercicios.calculadora;

import static javacore.aula02.exercicios.calculadora.Tela.exibir;

public class Main {
    public static void main(String[] args) {

        // EXERCÍCIO 1
        System.out.println("Chamando o método IMPRIME que engloba todos os valores");
        Operacao operacao = new Operacao();
        // podemos chamar o método que contém todos os valores,neste caso o IMPRIME
        operacao.imprime();

        // ou podemos chamar método por método
        System.out.println("Chamando cada método da calculadora");
        int somatorio = operacao.somar(5, 9);
        System.out.println(somatorio);
        int subtrair = operacao.subtracao(26, 7);
        System.out.println(subtrair);
        int dividido = operacao.divisao(5, 9);
        System.out.println(dividido);
        int multiplicado = operacao.multiplicacao();
        System.out.println(multiplicado);


        // EXERCÍCIO 2
       // Chamando um método static
        System.out.println("Chamando o método static da classe TELA ");
        exibir(5);

    }

}
