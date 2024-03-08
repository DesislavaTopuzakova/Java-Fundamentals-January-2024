package textProcessing;

import java.util.Scanner;

public class Digits_letters_Others_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine(); //"Agd#53Dfg^&4F53"

        //цифри
        StringBuilder digits = new StringBuilder();
        //букви
        StringBuilder letters = new StringBuilder();
        //други символи
        StringBuilder others = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            if (Character.isDigit(symbol)) {
                //символът ми е цифра
                digits.append(symbol);
            } else if (Character.isLetter(symbol)) {
                //символът ми е буква
                letters.append(symbol);
            } else {
                //символът ми е друг (различен от буква или цифра)
                others.append(symbol);
            }
        }

        System.out.println(digits);
        System.out.println(letters.toString());
        System.out.println(others.toString());

    }
}
