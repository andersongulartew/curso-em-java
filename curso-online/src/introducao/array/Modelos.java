package src.introducao.array;

public class Modelos {
    public static void main(String[] args) {
        // byte, short, int, long, float, double = 0
        // char = ' '
        // boolean = false
        // reference = null
        // os casos acima são resultados se não houver nenhum valor no array.

//        int[] idade = new int[3];
//        System.out.println("idade 1: " + idade[0]);
//        System.out.println("idade 2: " + idade[1]);
//        System.out.println("idade 3: " + idade[2]);
//
//        String[] idade2 = new String[3];
//        System.out.println("idade 1: " + idade2[0]);
//        System.out.println("idade 2: " + idade2[1]);
//        System.out.println("idade 3: " + idade2[2]);
//
        float[] idade3 = new float[3];
        System.out.println("idade 1: " + idade3[0]);
        System.out.println("idade 2: " + idade3[1]);
        System.out.println("idade 3: " + idade3[2]);

        System.out.println("------------------------------");
        String [] nomes = new String[3];
        nomes[0] = "John";
        nomes[1] = "Jane";
        nomes[2] = "Jack";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }


    }
}
