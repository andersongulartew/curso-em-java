public class Conta  implements Comparable<Conta>{
    private String nome;
    private double saldoTotal;

    public Conta(){}

    public Conta(String nome) {
        this.nome = nome;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public String getNome() {
        return nome.substring(0,20) + "...0";
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Conta proximaConta) {
        if(this.saldoTotal < proximaConta.saldoTotal){
            return -1;// na ordem inversa
        }
        if(this.saldoTotal > proximaConta.saldoTotal){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Nome %s R$ %2f \n", nome, saldoTotal);
    }
}
