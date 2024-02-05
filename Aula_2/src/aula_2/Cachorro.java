package aula_2;

public class Cachorro {
   public String nome;
   public String raca;
   public int idade;
   public String cor;
   
   
   
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
