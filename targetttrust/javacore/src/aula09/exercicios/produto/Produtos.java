package aula09.exercicios.produto;

public abstract class Produtos {
    String nome;
    private double preco;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    public abstract double calcularDesconto();
}
