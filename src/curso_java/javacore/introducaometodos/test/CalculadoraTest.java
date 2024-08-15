package src.javacore.introducaometodos.test;

import src.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtrairDoisNumeros();
        calc.multiplicarDoisNumeros(5,5);
        System.out.println("------------------------");

        System.out.println("divisão de dois numeros");
        double result = (calc.dividiDoisNumeros(25,5));
        System.out.println(result);
        System.out.println("------------------------");

        System.out.println("Imprimindo dois números divididos");
        calc.imprimeDoisNumerosDividido(20,0);
        calc.imprimeDoisNumerosDividido(20,5);
        System.out.println("------------------------");

        System.out.println("VarArgs");
        int[] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);  // VarArgs se descreve os numeros ao inves do nome do array
        System.out.println("------------------------");


        System.out.println("Continuando a exec.");

    }
}
