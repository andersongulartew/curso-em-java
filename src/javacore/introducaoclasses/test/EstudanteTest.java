package src.javacore.introducaoclasses.test;

import src.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
       Estudante info = new Estudante();
       info.nome = "joão";
       info.matricula = "1212";
       info.idade = 21;

        System.out.println(info.nome);
        System.out.println(info.matricula);
        System.out.println(info.idade);
    }
}
