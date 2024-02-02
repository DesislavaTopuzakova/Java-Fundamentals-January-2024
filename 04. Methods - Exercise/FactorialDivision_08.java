import java.util.Scanner;

public class FactorialDivision_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long firstNumberFactorial = calculateFactorial(firstNumber);
        long secondNumberFactorial = calculateFactorial(secondNumber);

        double result = firstNumberFactorial * 1.0 / secondNumberFactorial;

        System.out.printf("%.2f", result);
    }

    public static long calculateFactorial(int number) {

        // 5! = 1 * 2 * 3 * 4 * 5
        long fact = 1;
        for (int i = 2; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }
}
