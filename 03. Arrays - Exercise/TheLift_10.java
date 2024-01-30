import java.util.Arrays;
import java.util.Scanner;

public class TheLift_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int waitingPeople = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isLiftFull = true;

        for (int position = 0; position < wagons.length; position++) {

            int availableSpace = 4 - wagons[position];

            if (availableSpace > 0) {
                if (availableSpace > waitingPeople) {
                    wagons[position] += waitingPeople;
                    waitingPeople = 0;
                    isLiftFull = false;

                } else {
                    wagons[position] = 4;
                    waitingPeople -= availableSpace;
                }
            }
        }

        if (!isLiftFull) {
            System.out.println("The lift has empty spots!");
        } else if (waitingPeople > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", waitingPeople);
        }

        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}