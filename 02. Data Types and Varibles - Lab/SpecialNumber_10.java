package DataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int number = 1; number <= n; number++) {
            int sum = 0;
            int currentNumber = number;
            while (currentNumber != 0) {
                int lastDigit = currentNumber % 10;
                sum += lastDigit;
                currentNumber /= 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(number + " -> True");
            } else {
                System.out.println(number + " -> False");
            }
        }
    }
}
