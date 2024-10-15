package src.javacore.sobrecargametodos;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    public Funcionario(String nome, String cpf, double salario, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;

    }

    public Funcionario(){

    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }



    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
        public void setRg(String rg) {
        this.rg = rg;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }


    public String getNome(String nome) {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
       public String getRg() {
        return rg;
    }
    public double getSalario() {
        return salario;
    }
}
