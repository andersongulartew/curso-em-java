public class Person {
    private String nome;
    private Integer idade;

    public Person(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void getIdade(Integer idade) {
        this.idade = idade;
    }
}
