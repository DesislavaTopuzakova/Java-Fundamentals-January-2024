import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //"Delete {element}" - delete all elements in the array which are equal to the given element
        //"Insert {element} {position}" - insert element at the given position

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            if (command.contains("Delete")) {
                // 1. "Delete {element}".split(" ") -> ["Delete", "45"]
                int element = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(List.of(element));
            } else if (command.contains("Insert")) {
                // 2. "Insert {element} {position}".split(" ") -> ["Insert", "29", "2"]
                int element = Integer.parseInt(command.split(" ")[1]);
                int position = Integer.parseInt(command.split(" ")[2]);
                numbers.add(position, element);
            }

            command = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
