package javacore.aula02;

public class Metodos {

    // METODO COM RETORNO
    public int soma(int a, int b) {
        return a + b;
    }
    public int multi(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int resultado = metodos.multi(3, 4);
        System.out.println(resultado);
    }

    // METODO SEM RETORNO

    public void imprimir(String mensagem) {
        System.out.println(mensagem);
    }




}
