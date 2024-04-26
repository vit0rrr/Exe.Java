import java.util.Scanner;
import java.util.Locale;


public class Main {
 
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);	
    Scanner sc = new Scanner(System.in);
    
    
    double nota1, nota2;

  while(true) {
	  try {
		  nota1 = Double.parseDouble(sc.nextLine());
		  if (nota1 < 0 || nota1 > 10) {
			  System.out.println("nota invalida");
			  continue;
		  }
		  break;
	  }catch(NumberFormatException e) {
		      System.out.println("nota invalida");		  
	   }
    }
  
  while(true) {
	  try {
		  nota2 = Double.parseDouble(sc.nextLine());
		  if (nota2 < 0 || nota1 > 10) {
			  System.out.println("nota invalida");
			  continue;
		  }
		  break;
	  }catch(NumberFormatException e) {
		      System.out.println("nota invalida");
       }
    }
    double media = (nota1 + nota2) / 2;
    System.out.printf("media = %.2f%n", media);
  
    sc.close();
   
    }
} 
    
  