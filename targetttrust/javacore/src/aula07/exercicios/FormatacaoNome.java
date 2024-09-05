package aula07.exercicios;

public class FormatacaoNome {
    public static void main(String[] args) {

        String nome = "Anderson Gularte Wodnoff";
        String[] nomeArray = nome.split(" ");
        nome = nomeArray[2] + "," + nomeArray[0] + " " + nomeArray[1];
        System.out.println(nome);


        String nome1 = "Anderson Gularte Wodnoff";
        String novoNome = nome1.replace("Anderson Gularte Wodnoff", "Wodnoff,Anderson Gularte");
        System.out.println(novoNome);

    }
}
