import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            if (command.contains("swap")) { // Ако командата е swap
                // swap 1 3
                int firstIndex = Integer.parseInt(command.split(" ")[1]);
                int secondIndex = Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber = numbers[firstIndex];
                int secondIndexNumber = numbers[secondIndex];

                numbers[firstIndex] = secondIndexNumber;
                numbers[secondIndex] = firstIndexNumber;
            } else if (command.contains("multiply")) { // Ако командата е multiply
                // multiply 1 2
                int firstIndex = Integer.parseInt(command.split(" ")[1]);
                int secondIndex = Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber = numbers[firstIndex];
                int secondIndexNumber = numbers[secondIndex];

                int product = firstIndexNumber * secondIndexNumber;

                numbers[firstIndex] = product;

            } else { // Командата е decrese
                for (int position = 0; position <= numbers.length - 1; position++) {
                    numbers[position]--;
                }
            }

            command = scanner.nextLine();
        }

        //  Начин 1:
//        for (int position = 0; position < numbers.length; position++) {
//
//            if (position == numbers.length - 1) {
//                System.out.print(numbers[position]);
//            } else {
//                System.out.print(numbers[position] + ", ");
//            }
//        }

        //Начин 2:
        System.out.println(
                Arrays.toString(numbers)
                        .replace("[", "")
                        .replace("]", "")
        );
    }
}
