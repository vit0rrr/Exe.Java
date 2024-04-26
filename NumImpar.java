import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        System.out.println("Números ímpares entre " + X + " e " + Y + ":");

        for (int i = X + 1; i < Y; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
