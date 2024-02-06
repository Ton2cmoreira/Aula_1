package aula_2;

public class Cachorro {
   private String nome;
   private String raca;
   private int idade;
   private String cor;
   
   String Getnome() {
       return nome;
   }
   String Getraca() {
	   return raca;
   }
   
   int Getidade() {
	   return idade;
   }
   
   String Getcor() {
	   return cor;
   }
   
   public void setNome(String nome) {
	   this.nome = nome;
   }
   public void setRaca(String raca) {
	   this.raca = raca;
   }
   public void setIdade(int idade) {
	   this.idade = idade;
   }
   public void setCor(String cor) {
	   this.cor = cor;
   }
   public void Latir() {
	   System.out.println("O cacnhorro: "+ nome + "Latiu");
   }
   
   public void GetCachorro( ) {
	   System.out.println(
	   "Nome: " + nome +
	   "\nIdade: " + idade +
	   "\nCor:" + cor
	   );
   }
}
