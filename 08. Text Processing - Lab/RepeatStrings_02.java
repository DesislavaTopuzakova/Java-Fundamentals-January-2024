package textProcessing;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] texts = scanner.nextLine().split(" ");

        for (String text : texts) {
            int length = text.length(); //дължина на текста = брой символи в текст
            /*for (int count = 1; count <= length; count++) {
                System.out.print(text);
            }*/
            System.out.println(text.repeat(length));
        }
    }
}
