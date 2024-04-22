import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args){
        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner (System.in);
        
              
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double x = 0 ; 
     
     switch (codigo){
    	 case 1:
    		 x = 4.00;
    		 break;
    	 case 2:
    		 x = 4.50;
    		 break;
    	 case 3:
    		 x = 5.00;
    		 break;
    	 case 4:
    		 x = 2.00;
    		 break;
    	 case 5:
    		 x = 1.50;
    		 break;
     }
     
     double total = x * quantidade;
     
    System.out.printf("Total: R$ %.2f%n", total);

     
        
    }
 
}