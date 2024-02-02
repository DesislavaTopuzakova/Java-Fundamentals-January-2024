import java.util.Scanner;

public class TopNumber_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {

            boolean isValidSumDigits = isSumOfDigitsDivisibleByEight(number);
            boolean doesContainsOddDigit = doesNumberContainsOneOddDigit(number);

            if (isValidSumDigits && doesContainsOddDigit) {
                System.out.println(number);
            }
        }
    }

    public static boolean isSumOfDigitsDivisibleByEight(int number) {

        int sumOfDigits = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sumOfDigits += lastDigit;
            number /= 10;
        }

        return sumOfDigits % 8 == 0;
    }

    public static boolean doesNumberContainsOneOddDigit(int number) {

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            }
            number /= 10;
        }

        return false;
    }
}
