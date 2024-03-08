package textProcessing;

import java.util.Scanner;

public class ReverseStringWithStringBuilder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //входни данни -> дума или "end"

        while (!input.equals("end")) {
            //input -> дума
            //input = "hello"
            StringBuilder sb = new StringBuilder(input);
            sb.reverse();

            //входяща дума -> input
            //обърната дума -> reverseWord
            System.out.println(input + " = " + sb.toString());

            input = scanner.nextLine();
        }
    }
}
