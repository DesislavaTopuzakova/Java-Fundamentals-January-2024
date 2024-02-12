package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationsBasics_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt).collect(Collectors.toList());
        //numbers = {4, 19, 2, 53, 6, 43}

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            //1. command = "Add 3".split(" ") -> ["Add", "3"]
            //2. command = "Remove 2".split(" ") -> ["Remove", "2"]
            //3. command = "RemoveAt 1".split(" ") -> ["RemoveAt", "1"]
            //4. command = "Insert 8 3".split(" ") -> ["Insert", "8", "3"]
            String [] commandParts = command.split(" ");
            String commandName = commandParts[0]; // "Add", "Remove", "RemoveAt", "Insert"

            switch (commandName) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandParts[1]);
                    numbers.add(numberToAdd); //добавя стойността на numberToAdd в края на списъка
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(commandParts[1]);
                    numbers.remove(Integer.valueOf(numberToRemove)); //премахваме стойността на numberToRemove от списъка
                    break;
                case "RemoveAt":
                    int indexForRemove = Integer.parseInt(commandParts[1]);
                    numbers.remove(indexForRemove); //премахваме елемента на позиция = indexForRemove
                    break;
                case "Insert":
                    int numberForInsert = Integer.parseInt(commandParts[1]); //число за вмъкване
                    int indexForInsert = Integer.parseInt(commandParts[2]);// позиция, на която вмъкваме numberForInsert
                    numbers.add(indexForInsert, numberForInsert);
                    break;
            }
            command = scanner.nextLine();
        }

        //отпечатваме списъка разделен с интервал
        //numbers = {4, 19, 2, 53, 6, 43}
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
