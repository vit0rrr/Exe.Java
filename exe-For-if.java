import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y = scanner.nextInt();
        int X = scanner.nextInt();

        for (int i = 1; i <= Y; i++) {
            System.out.print(i+"");
           
            if (i % X == 0){
            	System.out.println();
            }
        }

        scanner.close();
    }
}
