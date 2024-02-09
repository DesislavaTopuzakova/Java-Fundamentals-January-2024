import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        //.toList(); // НЯМА ДА МОЖЕ ДА МАНИПУЛИРАМЕ ТОЗИ СПИСЪК, АКО ИЗПОЛЗВАМЕ ТОЗИ МЕТОД!

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            if (command.contains("Add")) {
                // 1. "Add 40".split(" ") -> ["Add", "40"]
                int count = Integer.parseInt(command.split(" ")[1]);
                wagons.add(count);
            } else {
                // 2. "40"
                int passengersToBeAdded = Integer.parseInt(command);
                for (int position = 0; position <= wagons.size() - 1; position++) {
                    int wagon = wagons.get(position);
                    if (wagon + passengersToBeAdded <= maxCapacity) {
                        wagons.set(position, wagon + passengersToBeAdded);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
