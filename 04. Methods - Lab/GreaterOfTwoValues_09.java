package Methods;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine(); // "int", "char, "string"

        executeComparisonByType(scanner, type);
    }

    private static void executeComparisonByType(Scanner scanner, String type) {
        switch (type) {
            case "int":
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int secondNumber = Integer.parseInt(scanner.nextLine());
                //сравнявам -> отпечатвам по-голямото
                compareAndPrint(firstNumber, secondNumber);
                break;
            case "char":
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);
                //сравнявам -> отпечатвам по-големия
                compareAndPrint(firstSymbol, secondSymbol);
                break;
            case "string":
                String firstText = scanner.nextLine();
                String secondText = scanner.nextLine();
                //сравнявам -> отпечатвам по-големия
                compareAndPrint(firstText, secondText);
                break;
        }
    }

    public static void compareAndPrint(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
    }

    public static void compareAndPrint(char firstSymbol, char secondSymbol) {
        if (firstSymbol > secondSymbol) {
            System.out.println(firstSymbol);
        } else {
            System.out.println(secondSymbol);
        }
    }

    public static void compareAndPrint(String firstText, String secondText) {
        //equals -> сравнява дали два текста са еднакви
        //compareTo -> сравнява два текста
        //1 -> първия текст > втория текст
        //-1 -> първия текст < втория текст

        if (firstText.compareTo(secondText) > 0) {
            System.out.println(firstText);
        } else {
            System.out.println(secondText);
        }
    }
}
