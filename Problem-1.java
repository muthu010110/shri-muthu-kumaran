
import java.util.Scanner;

class Calculator {
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
            case "+":
                return a + b;
            case "sub":
            case "subtract":
            case "-":
                return a - b;
            case "mul":
            case "multiply":
            case "*":
                return a * b;
            case "div":
            case "divide":
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

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add/sub/mul/div or + - * /): ");
        String op = sc.next();

        double result = calc.calculate(a, b, op);
        System.out.println("Result: " + result);

        sc.close();
    }
}
