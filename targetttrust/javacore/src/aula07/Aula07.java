package aula07;

public class Aula07 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Olá,");
        sb.append("mundo!");
        String resultado = sb.toString();
        System.out.println("StringBuilder: " + resultado);

        System.out.println("--------------------------------");

        StringBuffer sb2 = new StringBuffer();
        sb2.append("Olá,");
        sb2.append("mundo!");
        String resultado2 = sb2.toString();
        System.out.println("StringBuffer: " + resultado2);

        System.out.println("--------------------------------");

        // conferir se a STRING são iguais
        String str1 = "ola";
        String str2 = "ola";
        if (str1.equals(str2)) {
            System.out.println(" str1 e str2  dois são iguais");
        }

        // puxar um caracter específico
        String texto = "Exemplo";
        char primeiroCaracter = texto.charAt(0);
        System.out.println("primiroCaracter: " + primeiroCaracter);



    }


}
