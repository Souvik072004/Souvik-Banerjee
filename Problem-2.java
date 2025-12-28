import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.print((2 * i - 1));

            if (i < x) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}