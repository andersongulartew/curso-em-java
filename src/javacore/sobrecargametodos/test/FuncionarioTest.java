package src.javacore.sobrecargametodos.test;

import src.javacore.sobrecargametodos.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Nome : Anderson","CPF: 025.189.586-57",2500,"RG : 208644887");

        Funcionario funcionario2 = new Funcionario();

        funcionario.imprime();
        funcionario2.imprime();


    }
}
