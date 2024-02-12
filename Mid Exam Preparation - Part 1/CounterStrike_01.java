import java.util.Scanner;

public class CounterStrike_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        int wins = 0;

        String input = scanner.nextLine();
        while (!input.equals("End of battle")) {

            int distance = Integer.parseInt(input);
            if (distance <= energy) {
                wins++;
                energy -= distance;
                if (wins % 3 == 0) {
                    energy += wins;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wins, energy);
                return;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Won battles: %d. Energy left: %d", wins, energy);
    }
}
