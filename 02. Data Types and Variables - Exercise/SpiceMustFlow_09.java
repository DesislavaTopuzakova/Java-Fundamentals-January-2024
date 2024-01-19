import java.util.Scanner;

public class SpiceMustFlow_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Началната сила на полето
        int startingYield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int totalSpices = 0;

        while (startingYield >= 100) {

            // Берем подправки за деня
            totalSpices += startingYield;

            // Намаляме силата на полето с 10
            startingYield -= 10;

            // Екипажът, който събира подправките консумира по 26 подправки всеки ден
            totalSpices -= 26;

            days++;

            // Бракуваме допълнително 26 подправки, само ако полето е изтощено
            if (startingYield < 100) {
                totalSpices -= 26;
            }
        }

        System.out.println(days);
        System.out.println(totalSpices);
    }
}
