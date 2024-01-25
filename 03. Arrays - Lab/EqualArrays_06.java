package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean identical = true;
        int sum = 0;
        int foundPosition = 0;

        for (int position = 0; position <= firstArr.length - 1; position++) {
            int firstNum = firstArr[position];
            int secondNum = secondArr[position];

            if (firstNum == secondNum) {
                sum += firstNum;
            } else {
                foundPosition = position;
                identical = false;
                break;
            }

        }
        if (identical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d foundPosition.", foundPosition);
        }

    }
}
