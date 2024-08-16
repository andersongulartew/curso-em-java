package src.introducao.variaveistiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivosAula1 {
    public static void main(String[] args) {
              // Modelo 1
    //        float nota = 8.5f;
    //        System.out.println("A nota é " + nota);


            // Modelo 2
    //        float nota1 = 8.5f;
    //        System.out.printf( "A nota é %.2f", nota1);
    //        acrescentar casa decimal após o ponto = 8.50


             // Modelo 3
    //        String nome = "Anderson";
    //        float nota1 = 8.5f;
    //        System.out.printf( "A nota de %s é %.2f", nome,  nota1);
    //        acrescentando a string com ( %s ),depois incluindo nome.


                // Modelo 4
    //        String nome = "Anderson";
    //        float nota1 = 8.5f;
    //        System.out.format( "A nota de %s é %.2f", nome,  nota1);
    //        acrescentando a string com ( %s ),depois incluindo nome.

            // ENTRADA DE DADOS
            // voce implementa os que devem ser utilizados
    //        Scanner teclado = new Scanner(System.in);
    //
    //        System.out.println("Digite o nome do aluno: ");
    //        String nome2 = teclado.nextLine();
    //        System.out.println("Digite a nota do aluno: ");
    //        float nota2 = teclado.nextFloat();
    //        System.out.format( "A nota de %s é %.2f", nome2,  nota2);

            //Modelo 1
            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite o nome do funcionário: ");
            String nome2 = teclado.nextLine();
            System.out.println("Digite o idade do funcionário: ");
            int idade = teclado.nextInt();
            System.out.println("Digite o salario do funcionário: ");
            float salario = teclado.nextFloat();

            System.out.format("o nome do funcionário é :%s ,com a idade de :%d ,e com o salario de :%.3f",nome2,idade,salario );


    }
}


