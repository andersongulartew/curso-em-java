package src.javacore.introducaometodos.classes;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtrairDoisNumeros() {
        System.out.println(5 - 2);
    }


    // colocando parâmetros no método
    public void multiplicarDoisNumeros(int num1, int num2 ) {
        System.out.println(num1 * num2);
    }


    public double dividiDoisNumeros(double num1, double num2 ) {
        return num1 / num2;
    }


    // dividindo por 0
    public void imprimeDoisNumerosDividido(double num1, double num2 ) {
        if (num2 != 0) {
            System.out.println(num1/num2);
            return;
        }
        System.out.println("Não é possível dividir por 0");
    }

    public void alteraDoisNumeros(int num1, int num2 ) {
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do altera Dois Numeros");
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }


    public void somaArray(int[] numeros) {
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }




}
