import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    Locale.setDefault (Locale.US);
    
    int number = sc.nextInt();
    int HorasTrabalhadas = sc.nextInt();
    Double valorHora = sc.nextDouble();
    
    Double salario = valorHora * HorasTrabalhadas ;
    
    System.out.printf("NUMBER = %d\n",number);
    System.out.printf("SALARY = U$ %.2f%n",salario);

       
    }
}
 