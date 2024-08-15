package src.introducao.array;

public class ForEach {
    public static void main(String[] args) {

        int[] numeros = new int[5]; // primeira opção
        int[] numeros2 = {1, 2, 3, 4, 5}; // segunda opção
        int[] numeros3 = new int[]{1, 2, 3, 4, 5}; // terceira opção

//        for(int i = 0; i < numeros2.length; i++){
//            System.out.println(numeros2[i]);
//        }

        // foreach
        for(int num : numeros2){
            System.out.println(num);
        }



    }
}
