package exercicios.contabancaria;

public class Correntista {
    private String numeroConta;
    private Endereco endereco;


    public Correntista(String numeroConta, Endereco endereco) {
        this.numeroConta = numeroConta;
        this.endereco = endereco;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public String toString() {
        return numeroConta + endereco;

    }
}
