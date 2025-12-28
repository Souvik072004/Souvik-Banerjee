import java.util.Scanner;

class Calculator {

    double a;
    double b;

    // Constructor
    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Method to perform calculation
    double calculate(String operation) {
        switch (operation) {
            case "+":
                return a + b;

            case "-":
                return a - b;

            case "*":
                return a * b;

            case "/":
                if (b == 0) {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
                return a / b;

            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        String operation = sc.next();

        Calculator calculator = new Calculator(a, b);
        double result = calculator.calculate(operation);

        System.out.println("Result: " + result);

        sc.close();
    }
}