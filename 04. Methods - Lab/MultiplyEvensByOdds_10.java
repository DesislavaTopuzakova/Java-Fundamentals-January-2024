package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int [] sums = getSumEvenDddDigits(Math.abs(number));

        System.out.println(sums[0] * sums[1]);
    }

    private static int[] getSumEvenDddDigits(int number) {
        int sumEven = 0;
        int sumOdd = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sumEven += lastDigit;
            } else {
                sumOdd += lastDigit;
            }
            number /= 10;
        }
         return new int[] {sumEven, sumOdd};
    }
}
