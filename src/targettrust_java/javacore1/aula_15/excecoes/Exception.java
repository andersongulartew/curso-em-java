import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception {
    public static void main(String[] args) {
        // ERRO DE COMPILAÇÃO
        //FileInputStream file = new FileInputStream("arquivo.txt");


//        // TRATANDO COM BLOCO TRY-CATCH
//        try{
//            FileInputStream file2 = new FileInputStream("arquivo.txt");
//        }catch (FileNotFoundException e){
//            System.out.println("arquivo não encontrado");
//        }
//
//        int[] array = {1,2,3,4,5};
//        int valor = array[4];
//
//        try{
//            // pode ser lancado uma exeption
//        } finally {
//
//        }
//
//
//
//        FileInputStream file = null;
//         try{
//            file= new FileInputStream("arquivo.txt");
//            // realiza operação no arquivo
//        }catch (FileNotFoundException ex){
//            System.out.println("arquivo não encontrado");
//        }finally {
////             // lança execao chekada,precisa de bloco try-catch ouu lançar trows
////             //file.close();
//             if(file!=null){
//                 try{
//                     file.close();
//                 }catch (IOException ex){
//                     System.out.println("Erro ao fechar arquivo");
//                 }
//             }
//         }


        fazAlgo();

    }
    public static void fazAlgo(){
        try{
            // codigo que pode lancar um excecao
            int result = 1/0;
        }catch(java.lang.Exception e){
            throw new IllegalStateException("ocorreu um erro", e);
            //ou
            //throw e ;  // lancara a mesma exception
        }
    }

}
