package Methods;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine(); //"add", "multiply", "subtract", "divide"
        int firstNumber = Integer.parseInt(scanner.nextLine()); //първото число
        int secondNumber = Integer.parseInt(scanner.nextLine()); //второто число

        executeOperation(operation, firstNumber, secondNumber);
    }

    private static void executeOperation(String operation, int firstNumber, int secondNumber) {
        switch (operation) {
            case "add":
                //събиране на firstNumber и secondNumber -> отпечатвам сумата
                sumAndPrint(firstNumber, secondNumber);
                break;
            case "multiply":
                //умножние на firstNumber и secondNumber -> отпечатвам произведението
                multiplyAndPrint(firstNumber, secondNumber);
                break;
            case "subtract":
                //изваждане на firstNumber и secondNumber -> отпечатвам разлика
                subtractAndPrint(firstNumber, secondNumber);
                break;
            case "divide":
                //деление на firstNumber и secondNumber -> отпечатвам частно
                divideAndPrint(firstNumber, secondNumber);
                break;

        }
    }

    //метод, който събира две цели числа и отпечтва сумата
    public static void sumAndPrint(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    //метод, който умножава две цели числа и отпечатва произведението
    public static void multiplyAndPrint(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    //метод, който изважда две цели числа и отпечатва разлика
    public static void subtractAndPrint(int n1, int n2) {
        int diff = n1 - n2;
        System.out.println(diff);
    }

    //метод, който дели две цели числа и отпечатва частно
    public static void divideAndPrint(int n1, int n2) {
        System.out.println(n1 / n2);
    }
}
