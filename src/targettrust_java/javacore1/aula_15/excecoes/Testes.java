public class Testes {
    public static void main(String[] args) {
/*        // erro em empo da compilação
        procurarUsuarioPorEmail("emailo@email.com");

        try {
            // codigo que pode lançar exception personalizada
            procurarUsuarioPorEmail("emailo@email.com");
        } catch (UsuarioExistenteException e) {
            System.out.println("excecao personalizada " + e.getMessage());
        }
    }
        public static void procurarUsuarioPorEmail(String email) {
            // procurar no banco de dados....
            boolean temUsuario = true;

                // se encontar ,lança exception
            if(temUsuario){
                throw new UsuarioExistenteException("ja existe um usuario com este email" + email);
            }*/


        try {
            // int i = 1/0;

            // testar com valor diferente de zero
            int i = 1 / 1;
            fazAlgo();
        } catch (ArithmeticException e) {
            System.out.println("Aconteceu uma ArithmeticException");
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Aconteceu uma RuntimeException");
            System.out.println(e.getMessage());
        }
    }


    public static void fazAlgo() {
        //lançar runtimeException
        throw new RuntimeException();
    }


}

