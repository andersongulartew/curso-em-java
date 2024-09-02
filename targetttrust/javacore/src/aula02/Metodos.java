package javacore.aula02;

public class Metodos {

    // MÉTODO COM RETORNO
    public int soma(int a, int b) {
        return a + b;
    }
    public int multi(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int resultado = metodos.multi(3, 4);
        int resultado1 = metodos.soma(5, 3);
        System.out.println(resultado);
        System.out.println(resultado1);
    }

    // MÉTODO SEM RETORNO

    public void imprimir(String mensagem) {
        System.out.println(mensagem);
    }




}
