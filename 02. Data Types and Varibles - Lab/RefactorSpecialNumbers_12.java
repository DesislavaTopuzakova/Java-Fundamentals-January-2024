package DataTypesAndVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= count; number++) {
            int sum = 0;
            int currentNumber = number;
            while (currentNumber > 0) {
                sum += currentNumber % 10;
                currentNumber = currentNumber / 10;
            }
            boolean isTrue = (sum == 5) || (sum == 7) || (sum == 11);
            if (isTrue) {
                System.out.printf("%d -> True%n", number);
            } else {
                System.out.printf("%d -> False%n", number);
            }

        }

    }
}
