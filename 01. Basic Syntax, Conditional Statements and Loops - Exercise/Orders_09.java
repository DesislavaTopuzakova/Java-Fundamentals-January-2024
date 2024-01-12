import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double money = 0;

        for (int order = 1; order <= orders; order++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double orderPrice = ((daysInMonth * capsulesCount) * pricePerCapsule);
            money += orderPrice;

            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
        }

        System.out.printf("Total: $%.2f", money);
    }
}