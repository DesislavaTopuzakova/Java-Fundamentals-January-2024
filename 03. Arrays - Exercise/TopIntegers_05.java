import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int position = 0; position < numbers.length - 1; position++) {

            int currentNumber = numbers[position];
            boolean isTop = true;

            for (int nextPosition = position + 1; nextPosition < numbers.length; nextPosition++) {
                int nextNumber = numbers[nextPosition];
                if (nextNumber >= currentNumber) {
                    isTop = false;
                    break;
                }
            }

            if (isTop) {
                System.out.print(currentNumber + " ");
            }
        }

        System.out.println(numbers[numbers.length - 1]);
    }
}