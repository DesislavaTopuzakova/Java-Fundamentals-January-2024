package Arrays;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 -> "Monday"
        //2 -> "Tuesday"
        //3 -> "Wednesday"
        //4 -> "Thursday"
        //5 -> "Friday"
        //6 -> "Saturday"
        //7 -> "Sunday"
        //other -> Invalid day!
        int numberDay = Integer.parseInt(scanner.nextLine());

        String [] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
                                "Friday", "Saturday", "Sunday"};

        if (numberDay >= 1 && numberDay <= 7) {
            //отпечатваме деня на текущия номер
            System.out.println(daysOfWeek[numberDay - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
