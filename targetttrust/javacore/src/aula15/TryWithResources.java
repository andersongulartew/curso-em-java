import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("resouce.txt")) {
            //operações

        } catch (IOException e) {
            System.out.println("Erro ao manipular arquivo");
        }



    }
}
