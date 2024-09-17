package colecoes;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {

        java.util.Queue diasSemana = new LinkedList();
        diasSemana.add("Dommigo");
        diasSemana.add("Segunda");
        diasSemana.add("Terça");
        diasSemana.add("Quarta");
        diasSemana.add("Quinta");
        diasSemana.add("Sexta");
        diasSemana.add("Sabado");
        System.out.println("Dias da Semana: " + diasSemana +"\n");

            // remove e retorna o inicio da fila
        System.out.println("poll()" + diasSemana.poll());
        System.out.println("Dias da semana atualizado: " + diasSemana);

        // nao remove mas apenas retorna o inicio da fila
        System.out.println("peek()" + diasSemana.peek());
        System.out.println("Dias da semana atualizado: " + diasSemana);

        // remove e retorna o inicio da fila
        System.out.println("remove()" + diasSemana.remove());
        System.out.println("Dias da semana atualizado: " + diasSemana);

    }

}
