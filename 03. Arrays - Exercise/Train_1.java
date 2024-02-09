import java.util.Scanner;

public class Train_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wagonsCount = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[wagonsCount];

        for (int wagon = 0; wagon < wagonsCount; wagon++) {
            int group = Integer.parseInt(scanner.nextLine());
            wagons[wagon] = group;
        }

        int sum = 0;

        for (int number : wagons) {
            System.out.print(number + " ");
            sum += number;
        }

        System.out.println();
        System.out.println(sum);
    }
}