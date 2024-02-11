package Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ListManipulationAdvanced_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        List<Integer> newNumbers = Arrays.stream(number.split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.startsWith("Contains")) {

                int numbToCheck = Integer.parseInt(command.split(" ")[1]);
                printIsContain(newNumbers, numbToCheck);

            } else if (command.startsWith("Print even")) {

                printEven(newNumbers);


            } else if (command.startsWith("Print odd")) {

                printOdd(newNumbers);



            } else if (command.startsWith("Get sum")) {

                printSum(newNumbers);

            } else if (command.startsWith("Filter")) {

                int numberforChecking = Integer.parseInt(command.split(" ")[2]);
                String sign = command.split(" ")[1];
                printFilter(newNumbers, sign, numberforChecking);

            }

            command = scanner.nextLine();

        }

    }

    public static void printFilter(List<Integer> newNumbers, String sign, int numberforChecking) {
        //'<', '>', ">=", "<="

        if (sign.equals(">")) {
            for (int number : newNumbers) {
                if (number > numberforChecking) {
                    System.out.print(number + " ");

                }

            }
            System.out.println();

        } else if (sign.equals(">=")) {
            for (int number : newNumbers) {
                if (number >= numberforChecking) {

                    System.out.print(number + " ");

                }

            }
            System.out.println();

        } else if (sign.equals("<")) {
            for (int number : newNumbers) {
                if (number < numberforChecking) {
                    System.out.print(number + " ");

                }

            }
            System.out.println();

        } else if (sign.equals("<=")) {
            for (int number : newNumbers) {
                if (number <= numberforChecking) {

                    System.out.print(number + " ");

                }

            }
            System.out.println();




        }

    }

    public static void printEven(List<Integer> newNumbers) {
        for (int number:newNumbers){
            if (number % 2 == 0) {
                System.out.print(number + " ");

            }

        }
        System.out.println();

    }

    public static void printOdd(List<Integer> newNumbers) {
        for (int number:newNumbers){
            if (number % 2 != 0) {
                System.out.print(number + " ");


            }
        }
        System.out.println();

    }

    public static void printIsContain(List<Integer> newNumbers, int numbToCheck) {
        if (newNumbers.contains(numbToCheck)) {

            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }
    public static void printSum(List<Integer>newNumbers){
        int sum = 0;
        for (int i = 0; i <= newNumbers.size() - 1; i++) {
            int numbPart = newNumbers.get(i);
            sum += numbPart;
        }
        System.out.println(sum);

    }
}
