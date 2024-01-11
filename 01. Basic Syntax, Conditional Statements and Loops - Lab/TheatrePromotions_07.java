package BasicsOverview;

import java.util.Scanner;

public class TheatrePromotions_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;

        if (day.equals("Weekday")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                price = 12;
            } else if (age > 18 && age <= 64) {
                price = 18;
            } else {
                System.out.println("Error!");
            }
        } else if (day.equals("Weekend")) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                price = 15;
            } else if (age > 18 && age <= 64) {
                price = 20;
            } else {
                System.out.println("Error!");
            }
        } else if (day.equals("Holiday")) {
            if ((age >= 0 && age <= 18)) {
                price = 5;
            } else if (age > 18 && age <= 64) {
                price = 12;
            } else if (age > 64 && age <= 122) {
                price = 10;
            } else {
                System.out.println("Error!");
            }
        }

        if (price != 0) {
            System.out.printf("%d$", price);
        }
    }
}
