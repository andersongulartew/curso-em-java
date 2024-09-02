package aula05;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ExampleDoWhile {
     private static List<Aluno> alunos = new ArrayList(List.of(
            new Aluno("Ana", LocalDate.parse("1992-01-01")),
            new Aluno("Bia", LocalDate.parse("1993-03-15")),
            new Aluno("Leo", LocalDate.parse("1990-05-23")),
            new Aluno("Roger", LocalDate.parse("1998-12-31"))
    ));

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        do {
            opcao = imprimirMenu();
            switch (opcao) {
                case 1: listarAluno();break;
                case 2: criarAluno();break;
                case 3: deletarAluno();break;
            }
        } while (opcao != 0);

        System.out.println("Programa Finalizado");
        scanner.close();
    }

    public static int imprimirMenu() {
        clearScreen();
        System.out.println("Escolha uma ação: ");
        System.out.println("1. Listar de alunos");
        System.out.println("2. Criar aluno");
        System.out.println("3. Deletar aluno");
        System.out.println("0. Sair");
        return scanner.nextInt();
    }

    public static void listarAluno() {
        System.out.println("Listar Alunos......");
        for(Aluno aluno : alunos) {
            System.out.println(aluno);
        }
        scanner.next();
    }

    public static void deletarAluno() {
        System.out.println("Deletar Aluno...");
        System.out.println("Qual a posição deseja deletar ? ");
        int posicao = scanner.nextInt();

        if(posicao >= alunos.size()) {
            System.out.println("Tamanho maior que a lista de alunos, será removido o último");
            posicao = alunos.size();
        }

        if(posicao <= 0) {
            System.out.println("Não aceita-se posição negativa ou zero");
            return;
        }

        alunos.remove(posicao - 1);

        System.out.println("Aluno removido com sucesso!");
        scanner.nextLine();

    }

    public static void criarAluno() {
        System.out.println("Criar Aluno...");
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.next();
        System.out.println("Digite a data de nascimento do aluno: ");
        String dataNascimentoInput = scanner.next();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoInput);

        Aluno aluno = new Aluno(nome, dataNascimento);

        alunos.add(aluno);
        System.out.println("Aluno criado com sucesso!");
        scanner.nextLine();

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}