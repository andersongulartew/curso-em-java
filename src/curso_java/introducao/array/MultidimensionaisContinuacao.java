package src.introducao.array;

public class MultidimensionaisContinuacao {
    public static void main(String[] args) {
        // array multidimensional com 3 posicao,cada uma com numeros de elementos diferentes

        int[] [] dias = new int [3][];
        dias[0] = new int[2]; // posição "0" com 2 elementos
        dias[1] = new int[]{1,2,3}; // posição "1" com 3 elementos
        dias[2] = new int[]{1,2,3,4}; // posição "2" com 4 elementos

        // forach
        for(int[] array : dias) {
            for(int num : array) {
                System.out.println(num);
            }
        }

        // outra forma de descrever
        //int[][] dia = {{0,0},{4,5,6},{7,8,9,10}};
            //System.out.println(dia[1][2]);
    }
}
