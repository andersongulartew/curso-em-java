package aula09.exercicios.produto;

public class Eletronico extends Produtos {

    private String marca;

    public Eletronico(String nome, double preco, String marca) {
        super(nome, preco);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public double calcularDesconto() {
        return getPreco()*0.95;
    }

}
