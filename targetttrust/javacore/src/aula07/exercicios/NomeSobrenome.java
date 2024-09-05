package aula07.exercicios;

public class NomeSobrenome {
    public static void main(String[] args) {
//        String nomeCompleto = "Anderson Gularte Wodnoff";
//        String[] nomeSeparado = nomeCompleto.split(" ");
//        String nome = nomeSeparado[0];
//        String sobrenome = "";
//        for (int i = 1; i < nomeSeparado.length; i++) {
//            sobrenome += nomeSeparado[i] + " ";
//        }
//        System.out.println(nome);
//        System.out.println(sobrenome);

        String nomeCompleto1 = "Anderson Gularte Wodnoff";
        String[] nomeSeparado1 = nomeCompleto1.split(" ");
        System.out.println(nomeSeparado1[0]);
        System.out.println(nomeSeparado1[1]+" " +nomeSeparado1[2]);

        System.out.println("----------------------------------");

        // esta quebrando a linha e não separando o nome do sobrenome
        String nomeCompleto = "Anderson\nGularte Wodnoff";
        System.out.println(nomeCompleto);


    }
}
