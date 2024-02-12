import java.util.Scanner;

public class MuOnline_Bonus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] rooms = scanner.nextLine().split("\\|");

        int health = 100;
        int coins = 0;
        int roomsCount = 0;

        for (String room : rooms) {

            //"cat 10"
            String name = room.split(" ")[0];
            int amount = Integer.parseInt(room.split(" ")[1]);
            roomsCount++;

            switch (name) {
                case "potion":
                    int healAmount = Math.min(100 - health, amount);
                    health += healAmount;
                    System.out.printf("You healed for %d hp.\n", healAmount);
                    System.out.printf("Current health: %d hp.\n", health);
                    break;
                case "chest":
                    coins += amount;
                    System.out.printf("You found %d bitcoins.\n", amount);
                    break;
                default:
                    health -= amount;
                    if (health > 0) {
                        System.out.printf("You slayed %s.\n", name);
                    } else {
                        System.out.printf("You died! Killed by %s.\n", name);
                        System.out.printf("Best room: %d", roomsCount);
                        return;
                    }
                    break;
            }
        }

        System.out.println("You've made it!");
        System.out.println("Bitcoins: " + coins);
        System.out.println("Health: " + health);
    }
}
