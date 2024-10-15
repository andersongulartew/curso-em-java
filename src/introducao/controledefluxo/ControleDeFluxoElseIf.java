package src.introducao.controledefluxo;

public class ControleDeFluxoElseIf {
    public static void main(String[] args) {
        // ELSE IF

        // idade < 15 categoria infantil
        // idade >=15 && <18  categoria juvenil
        // idade >=18 adulto
        int idade = 17;
        String categoria;

        if (idade <= 15) {
            categoria = "Infantil";
        } else if (idade > 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);

        ////////////////////

        int idade2 = 15;
        String status;

        // operador ternario
        status = idade2 < 18 ? "Não adulto" : "Adulto";
        System.out.println(status);
    }
}
