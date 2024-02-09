import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {

            if (command.contains("Add")) {
                int numberToBeAdded = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numberToBeAdded);
            } else if (command.contains("Insert")) {

                int numberToBeInserted = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                if (index >= 0 && index <= numbers.size() - 1) {
                    numbers.add(index, numberToBeInserted);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {

                int indexForRemoval = Integer.parseInt(command.split(" ")[1]);
                if (indexForRemoval >= 0 && indexForRemoval <= numbers.size() - 1) {
                    numbers.remove(indexForRemoval);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")) {

                int shiftLeftCount = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < shiftLeftCount; i++) {
                    int firstElement = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstElement);
                }
            } else if (command.contains("Shift right")) {

                int shiftRightCount = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < shiftRightCount; i++) {
                    int lastNumber = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, lastNumber);
                }
            }

            command = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
