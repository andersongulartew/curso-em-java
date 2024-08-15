package src.introducao.operadores;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        // =, -=,+=, *=, %=

        int salario = 1800;
        // salario = salario + 1000;

        salario +=1000;
        System.out.println(salario);

        salario -=1000;
        System.out.println(salario); // este retorno esta contanto com a soma acima, então saira 1800

    }
}
