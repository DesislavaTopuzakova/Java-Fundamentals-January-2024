import java.util.Scanner;

public class IntegerOperations_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        int number4 = Integer.parseInt(scanner.nextLine());

        // Формула: ((n1 + n2) / n3) * n4
        System.out.println(((number1 + number2) / number3) * number4);
    }
}
