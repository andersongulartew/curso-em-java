package aula06.src.main.java.br.com.targettrust;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionarios {
     private static List<Funcionario> funcionario = new ArrayList(List.of(
            new Funcionario("Ana", LocalDate.parse("1992-01-01")),
            new Funcionario("Bia", LocalDate.parse("1993-03-15")),
            new Funcionario("Leo", LocalDate.parse("1990-05-23")),
            new Funcionario("Roger", LocalDate.parse("1998-12-31"))
    ));

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        do {
            opcao = imprimirMenu();
            switch (opcao) {
                case 1: listarFuncionario();break;
                case 2: criarFuncionario();break;
                case 3: deletarFuncionario();break;
            }
        } while (opcao != 0);

        System.out.println("Programa Finalizado");
        scanner.close();
    }

    public static int imprimirMenu() {
        clearScreen();
        System.out.println("Escolha uma ação: ");
        System.out.println("1. Listar de Funcionários");
        System.out.println("2. Criar Funcionários");
        System.out.println("3. Deletar Funcionários");
        System.out.println("0. Sair");
        return scanner.nextInt();
    }

    public static void listarFuncionario() {
        System.out.println("Listar Alunos......");
        for(Funcionario funcionario : funcionario) {
            System.out.println(funcionario);
        }
        scanner.next();
    }

    public static void deletarFuncionario() {
        System.out.println("Deletar Aluno...");
        System.out.println("Qual a posição deseja deletar ? ");
        int posicao = scanner.nextInt();

        if(posicao >= funcionario.size()) {
            System.out.println("Tamanho maior que a lista de alunos, será removido o último");
            posicao = funcionario.size();
        }

        if(posicao <= 0) {
            System.out.println("Não aceita-se posição negativa ou zero");
            return;
        }

        funcionario.remove(posicao - 1);

        System.out.println("Aluno removido com sucesso!");
        scanner.nextLine();

    }

    public static void criarFuncionario() {
        System.out.println("Criar Funcionário...");
        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.next();
        System.out.println("Digite a data de nascimento do aluno: ");
        String dataNascimentoInput = scanner.next();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoInput);

        Funcionario colab = new Funcionario(nome, dataNascimento);

        funcionario.add(colab);
        System.out.println("Aluno criado com sucesso!");
        scanner.nextLine();

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
