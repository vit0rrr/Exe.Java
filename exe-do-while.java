import java.util.Scanner;
import java.util.Locale;


public class Main {
 
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);	
    Scanner sc = new Scanner(System.in);
    
    int  x;
  
    
    do {
      double nota1, nota2;
      boolean notaValida = false;
    
      while(!notaValida){
        nota1 = sc.nextDouble(); 
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("nota invalida");
            continue;
            }
    
      
        nota1 = sc.nextDouble(); 
        if (nota2 < 0 || nota2 > 10) {
            System.out.println("nota invalida");
            continue;
           }
            notaValida = true;
            
            double media = (nota1 + nota2) / 2;
            System.out.printf("media = %.2f%n", media);            
       } 
       
       do {
           System.out.println("novo calculo (1-sim 2-nao)");
           x = sc.nextInt();
       } while (x != 1 && x != 2);
       
       }while(x!=2);
        sc.close();

      }
    
    
    
     } 
    
  }    