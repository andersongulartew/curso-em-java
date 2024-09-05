package aula08;

public enum EstacoesDoAnoEnum {

    PRIMAVERA("Primavera"), VERAO("Verão"),OUTONO("Outono"),INVERNO("Inverno");

    private final String nome;
    EstacoesDoAnoEnum(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
