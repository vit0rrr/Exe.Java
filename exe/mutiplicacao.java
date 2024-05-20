package exe;
import java.util.Scanner;

public class mutiplicacao {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
   
    int N = sc.nextInt();
    
    for (int i = 1; i < 11; i++){
        int mutiplicacao = i * N ;
        System.out.println(i + " x " + N + " = " + mutiplicacao);   
    }
    sc.close();
      
    }
}