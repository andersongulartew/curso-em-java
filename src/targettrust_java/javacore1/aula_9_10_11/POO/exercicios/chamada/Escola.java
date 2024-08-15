package exercicios.chamada;

public class Escola extends Chamada {

    private String escola;
    public  Escola(String nome,String idade,String escola){
        super(nome,idade);
        this.escola = escola;

    }

    public String getEscola() {
        return escola;
    }

    @Override
    public String verificar() {
        return " Aluno: " + getNome()+"\n Idade: "+getIdade()+"\n Escola: "+getEscola();
    }

}
