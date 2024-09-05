package aula09.exercicios.contabancaria;

public class ContaBancaria {
    private double saldo;
    private  String titular;

    private Correntista correntista;

    public ContaBancaria(double saldo, String titular, Correntista correntista) {
        this.saldo = saldo;
        this.titular = titular;
        this.correntista = correntista;
    }

     public double verificarSaldo(){
        return saldo;
    }
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public Correntista getCorrentista() {
        return correntista;
    }

    public void depositar(double valor) {
        if(valor > 0){
            saldo += valor;
            System.out.println("Valor depositado com sucesso!");
        }else{
            System.out.println("Valor insuficiente!");
        }
    }
    public void sacar(double valor){
        if(valor > 0 && valor < saldo){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Valor do saque inválido");
        }
    }


}
