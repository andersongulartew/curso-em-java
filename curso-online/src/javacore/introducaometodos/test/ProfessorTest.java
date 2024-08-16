package src.javacore.introducaometodos.test;

import src.javacore.introducaometodos.classes.Professor;

// escrevendo o codigo de forma simples e reduzida (olhar  classe professor)
// assim podemos criar mais de um individuo sem precisar repetir o system.out.println().
// sem precisar repetir o mesmo codigo varias vezes
// deixamos fixo "system.out.println()" na classe de atributos (Professor)
// então precisara criar apenas informações(componentes) para os atributos
// desta forma melhoramos o codigo,ocupando menos espaço.


public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "John Doe";
        prof.matricula = "78232";
        prof.rg = "2086445505";
        prof.cpf = "123.456.789-00";

        Professor prof2 = new Professor();
        prof2.nome = "July On";
        prof2.matricula = "85798";
        prof2.rg = "2086448977";
        prof2.cpf = "555.456.153-00";

        prof.imprime();
        prof2.imprime();

       //prof.imprime(prof2);



    }
}
