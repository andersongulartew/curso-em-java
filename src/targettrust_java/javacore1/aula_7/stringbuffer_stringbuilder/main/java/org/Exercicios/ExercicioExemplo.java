package org.Exercicios;

public class ExercicioExemplo {
    public static void main(String[] args) {
        // Exercicio Exemplo
        // metodo que inverta uma string
        String nome = "anderson";
        StringBuilder str = new StringBuilder(nome);
        nome = str.reverse().toString();
        System.out.println(nome);



    }
}
