

public class Problem3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        int oddCount = value / 2;
        if (value % 2 != 0) {
            oddCount++;
        }

        int number = 1;
        for (int i = 0; i < oddCount; i++) {
            System.out.print(number);
            number += 2;

            if (i < oddCount - 1) {
                System.out.print(", ");
            }
        }

        input.close();
    }
}
