import java.util.Scanner;

public class Vacation_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String weekday = scanner.nextLine();

        double price = 0;

        if (group.equals("Students")) {
            if (weekday.equals("Friday")) {
                price = 8.45;
            } else if (weekday.equals("Saturday")) {
                price = 9.80;
            } else if (weekday.equals("Sunday")) {
                price = 10.46;
            }

            if (studentsCount >= 30) {
                price = price * 0.85;
            }
        } else if (group.equals("Business")) {
            if (weekday.equals("Friday")) {
                price = 10.90;
            } else if (weekday.equals("Saturday")) {
                price = 15.60;
            } else if (weekday.equals("Sunday")) {
                price = 16;
            }

            if (studentsCount >= 100) {
                studentsCount = studentsCount - 10;
            }
        } else if (group.equals("Regular")) {
            if (weekday.equals("Friday")) {
                price = 15;
            } else if (weekday.equals("Saturday")) {
                price = 20;
            } else if (weekday.equals("Sunday")) {
                price = 22.50;
            }

            if (studentsCount >= 10 && studentsCount <= 20) {
                price = price * 0.95;
            }
        }

        double totalPrice = studentsCount * price;
        System.out.printf("Total price: %.2f", totalPrice);
    }
}