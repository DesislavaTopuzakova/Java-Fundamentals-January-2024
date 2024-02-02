package Methods;

import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f",calculatePower(number, power));
    }

    private static double calculatePower(int number, int power) {
        return Math.pow(number, power);
    }

}
