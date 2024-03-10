package textProcessing;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstText = scanner.nextLine();
        String secondText = scanner.nextLine();

        int index = secondText.indexOf(firstText);
        //firstText = "ice"
        //secondText = "kgb"
        //ако firstText се съдържа в secondText -> на коя позиция се намира
        //ако firstText НЕ СЕ СЪДЪРЖА в secondText -> -1

        while (index != -1) {
            //firstText го има secondText
            secondText = secondText.replace(firstText, "");
            //след премахването -> търсим дали имаме тази дума
            index = secondText.indexOf(firstText);
        }

        System.out.println(secondText);

    }
}
