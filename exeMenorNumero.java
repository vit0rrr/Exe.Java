import java.util.Scanner;
import java.util.Locale;

public class Main{
    public static void main(String[]args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner (System.in);
    
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();

    if(n1< n2 && n1 < n3){
        System.out.printf("MENOR = "+n1);
    }else if(n2< n3) {
        System.out.printf("MENOR = "+n2);
    }else{
        System.out.printf("MENOR = "+n3);
    }
    sc.close();
    }
}