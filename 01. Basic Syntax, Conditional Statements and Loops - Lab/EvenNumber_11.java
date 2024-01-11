package BasicsOverview;

import java.util.Scanner;

public class EvenNumber_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //while
        //повтаряме: въвеждаме цяло число
        //стоп: число е четно
        //продължаваме: число е нечетно

        int number = Integer.parseInt(scanner.nextLine());

        while (number % 2 != 0) {
            //нечетно число
            System.out.println("Please write an even number.");

            //прочитаме
            number = Integer.parseInt(scanner.nextLine());
        }

        //четно число -> прекратили цикъла
        System.out.println("The number is: " + Math.abs(number));

    }
}
