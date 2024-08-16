package src.javacore.introducaoclasses.test;

import src.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "John Doe";
        prof.matricula = "78232";
        prof.rg = "2086445505";
        prof.cpf = "123.456.789-00";

        // prof = prof2;
        // esta dizendo que a informação da variavel prof vai ser igual prof2,
        // como se as informações anteriores do prof não existisse

        Professor prof2 = new Professor();
        prof2.nome = "July On";
        prof2.matricula = "85798";
        prof2.rg = "2086448977";
        prof2.cpf = "555.456.153-00";

         System.out.println(prof.nome);
        System.out.println(prof.matricula);
        System.out.println(prof.rg);
        System.out.println(prof.cpf);
        System.out.println("-----------------------------");
        System.out.println(prof2.nome);
        System.out.println(prof2.matricula);
        System.out.println(prof2.rg);
        System.out.println(prof2.cpf);

    }
}
