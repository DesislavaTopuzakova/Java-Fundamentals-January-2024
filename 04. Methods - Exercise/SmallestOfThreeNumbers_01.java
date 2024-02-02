import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(firstNumber, secondNumber, thirdNumber);
    }

    public static void printSmallestNumber(int num1, int num2, int num3) {

        System.out.println(Math.min(Math.min(num1, num2), num3));
    }
}