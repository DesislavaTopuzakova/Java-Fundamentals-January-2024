package BasicsOverview;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hour * 60 + minutes;
        int totalMinutesBack = totalMinutes + 30;

        int resultHour = totalMinutesBack / 60;
        int resultMinutes = totalMinutesBack % 60;

        if (resultHour > 23) {
            resultHour = 0;
        }

        System.out.printf("%d:%02d", resultHour, resultMinutes);
    }
}
