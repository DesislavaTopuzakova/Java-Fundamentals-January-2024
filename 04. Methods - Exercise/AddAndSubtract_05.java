import java.util.Scanner;

public class AddAndSubtract_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int sum = sumTwoNumbers(firstNumber, secondNumber);
        int result = subtractTwoNumbers(sum, thirdNumber);

        System.out.println(result);
    }

    public static int sumTwoNumbers(int num1, int num2) {

        return num1 + num2;
    }

    public static int subtractTwoNumbers(int num1, int num2) {

        return num1 - num2;
    }
}
