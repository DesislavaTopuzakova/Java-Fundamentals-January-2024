import java.util.Arrays;
import java.util.Scanner;

public class ArrayRecap {

    public static void main(String[] args) {

        // Масив от числа
        int[] numbers1 = new int[3];

        numbers1[0] = 5;
        numbers1[1] = 20;
        numbers1[2] = 25;

        // Прочитане на масив от конзолата
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] towns = input.split(" ");

        // foreach цикъл
        for (String town : towns) {
            System.out.println(town + " is a nice city.");
        }

        // String.join
        System.out.println(String.join(", ", towns));

        // Прочитане на целочислен масив от конзолата
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();

    }
}
