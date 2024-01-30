import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        //1 7 6 2 19 23

        for (int position = 0; position < numbers.length - 1; position++) {

            int currentNumber = numbers[position];

            for (int nextPosition = position + 1; nextPosition <= numbers.length - 1; nextPosition++) {

                int nextNumber = numbers[nextPosition];

                if (currentNumber + nextNumber == magicSum) {
                    System.out.printf("%d %d\n", currentNumber, nextNumber);
                }
            }
        }

    }
}
