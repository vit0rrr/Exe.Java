package exe;
import java.util.Scanner;
 
public class exeQuadrante {
 
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == 0 || y == 0) {
                break; 
            }

      if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
        }

        sc.close();
    }
 
}