package Methods;

import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        switch (operation) {
            case "/":
                divide(a, b);
                break;
            case "*":
                multiply(a, b);
                break;
            case "+":
                add(a, b);
                break;
            case "-":
                subtract(a, b);
                break;
        }
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void subtract(int a, int b) {
        System.out.println(a - b);
    }
}
