package orientacaoobjetos;

public class OrientacaoObjeto {

    private String nome;
    private Integer idade;

   public String getNome(){
       return nome;
   }
   public void  setNome(String nome){
       this.nome = nome;
   }

   public Integer getIdade(){
       return idade;
   }
   public void  setIdade(Integer novaIdade){
       if(idade > 0){
           idade = novaIdade;
       }else{
           System.out.println("a  idade nao pode ser negativa");
       }
   }


}
