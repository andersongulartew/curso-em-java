package src.introducao.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
       // && = AND  || = OR

        int idade = 18;
        float salario = 1000f;

        // && - OS DOIS DEVEM ESTAR CORRETOS PARA "TRUE"
        System.out.println(idade >= 18  && salario >= 1000); // true
        System.out.println(idade >= 18 && salario >=3000);// false

        // || - PRECISA APENAS DE UM CORRETO PARA RETORNAR "TRUE"
        System.out.println(idade <= 16 || salario >= 1000);
        System.out.println(idade <= 16 || salario >= 3000); // duas erradas retorna FALSE
    }
}
