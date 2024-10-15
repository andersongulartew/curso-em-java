package src.javacore.introducaometodos.test;

import src.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante aluno = new Estudante();
        aluno.setNome ("John Doe");
        aluno.setIdade (31);
        aluno.setNotas (new double[]{8, 9, 10});


        aluno.imprimir();
        aluno.tirarMedia();
        System.out.println("Aprovado ?" + aluno.isAprovado());


    }
}
