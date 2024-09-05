package aula09.exercicios.contabancaria;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua: A nº12 - Bairro: são José - Porto Alegre/RS");
        Correntista correntista = new Correntista("15897-56 -  ", endereco);
        ContaBancaria conta = new ContaBancaria(1500, "Joao", correntista);
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: " + conta.verificarSaldo());
        System.out.println("Conta e Endereço: " + conta.getCorrentista());
        System.out.println("-------------------------------------------------------------");

        conta.depositar(500);
        System.out.println("saldo atual após deposito: " + conta.verificarSaldo());
        System.out.println("-------------------------------------------------------------");
        conta.sacar(500);
        System.out.println("Saldo atual após o saque: " + conta.verificarSaldo());
        System.out.println("-------------------------------------------------------------");
        conta.sacar(2000);
        System.out.println("Saldo atual: " + conta.verificarSaldo());

    }

}
