package exercicios;

public class Produto {
    String nome;
    double custoAquisicao;
    double valorVenda;

    public Produto() {

    }
    public Produto(String nome, double custoAquisicao, double valorVenda) {
        this.nome = nome;
        this.custoAquisicao = custoAquisicao;
        this.valorVenda = valorVenda;
    }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getCustoAquisicao() {
        return custoAquisicao;
    }
    public void setCustoAquisicao(double valorAquisicao) {
        this.custoAquisicao = valorAquisicao;
    }
    public double getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", custoAquisicao=" + custoAquisicao +
                ", valorVenda=" + valorVenda +
                '}';
    }
}