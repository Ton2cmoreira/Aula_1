package aula_2;

public class Praia {
     public String nome; 
	 public String ceu;
     public String temperatura;
     public String mare;
     public String previsao;
     
     
     public void Chover() {
    	 System.out.println("Estava fazendo:" + temperatura + "graus na praia da:" + nome + "agora: "+ previsao );
    	 
     }
     
     public void GetPraia() {
    	 System.out.println(
    	"Praia:" + nome +
    	"\nprevisao " + previsao +
    	"\ntemperatura" + temperatura 
    			 );
     }
}
