package src.javacore.introducaometodos.classes;


// crie uma classe com os atributos: nome; idade ; notas (tres notas)
// crie um metodo para imprimir os dados e tirar a media desse aluno,
// caso a media seja maior que 6 imprimir aprovado,senao reprovado
public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        //System.out.println("Media: " + this.media());

        if (this.notas != null) {
            for (double nota : this.notas) {
                System.out.print("\n nota : " + nota + " ");

            }
        }
    }


    // primeira maneira
    public void tirarMedia() {
        if (this.notas == null) {
            System.out.println("Aluno nao possui notas");
            return;
        }
        double media = 0;
        for (double nota : this.notas) {
            media += nota;
        }
        media = media / this.notas.length;
        if (media > 6) {
            System.out.println("\nA media é : " + media + ";Aprovado");
            this.aprovado = true;
        } else {
            System.out.println("\nA media é : " + media + ";Reprovado");
            this.aprovado = false;
        }
    }

//     // Segunda opção
//    public double media () {
//    double media = (notas[0] + notas[1] + notas[2]) / 3;
//     if(media > 6){
//         System.out.println("aprovado");
//     }else {
//         System.out.println("reprovado");
//     }
//     return media;
//
//}


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        if(idade < 0){
            System.out.println("você não pode fazer isso");
            return;
        }
        this.idade = idade;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }


    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public double[] getNotas() {
        return this.notas;
    }
    public boolean isAprovado() {
        return this.aprovado;
    }
}
