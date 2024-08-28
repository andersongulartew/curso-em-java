package aula06.src.main.java.br.com.targettrust;

public enum clasificacaoIMC {
    MAGRO,
    NORMAL,
    SOBREPESO;

    public String getClassificacaoPorExtenso() {
        switch (this) {
            case MAGRO:
                return "Pessoa Magra";
            case NORMAL:
                return "Pessoa Normal";
            case SOBREPESO:
                return "Pessoa com Sobrepeso";
            default:
                return null;
        }
    }
}
