package textProcessing;

import java.util.Scanner;

public class ReverseString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //входни данни -> дума или "end"
        while (!input.equals("end")) {
            //input -> дума
            //input = "hello"
            String reverseWord = ""; //обърнатата дума
            for (int position = input.length() - 1; position >= 0; position--) {
                char currentSymbol = input.charAt(position);
                reverseWord = reverseWord + currentSymbol;
                //reverseWord += currentSymbol;
            }

            //входяща дума -> input
            //обърната дума -> reverseWord
            System.out.println(input + " = " + reverseWord);

            input = scanner.nextLine();
        }


    }
}
