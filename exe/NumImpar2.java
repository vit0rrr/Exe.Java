package exe;
import java.util.Scanner;
 

public class NumImpar2 {
 
    public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
        
      int maiorValor = 0;
      int posicaoMaiorValor= 0;

        
       for (int i = 1; i <= 3; i++){
           
           int valor = sc.nextInt();
           
    	   if (valor > maiorValor) {
    	       maiorValor = valor ;
    	       posicaoMaiorValor = i;               
           }
       	}       
       System.out.println(maiorValor);
       System.out.println(posicaoMaiorValor);
       sc.close();          
  }        
}
 
