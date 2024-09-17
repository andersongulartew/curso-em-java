package exercicios.produto;

public class Livro extends Produtos {

    private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.90;
    }

}
