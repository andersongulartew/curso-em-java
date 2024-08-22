package javacore.aula01;

public class BemVindo {

        public static String saudacao() {
        return "Olá, bem-vindo!";
    }

    // Outro método estático que chama o método 'saudacao'
    public static void mostrarSaudacao() {
        // Chamando o método estático 'saudacao'
        String mensagem = saudacao();
        System.out.println(mensagem);
    }
}
