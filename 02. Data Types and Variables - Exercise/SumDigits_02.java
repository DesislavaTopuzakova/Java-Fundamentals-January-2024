import java.util.Scanner;

public class SumDigits_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        // Повтарям: числото > 0
        // 1. Вземам последната цифра от числото (числото % 10)
        // 2. Прибавям последната цифра към сумата (sum += lastDigit)
        // 3. Премахваме последната цифра от числото (числото / 10)

        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }

        System.out.println(sum);
    }
}
