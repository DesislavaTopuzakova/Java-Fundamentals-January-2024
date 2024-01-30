import java.util.Scanner;

public class ZigZagArrays_03 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        int position = 0;

        for (int row = 1; row <= n; row++) {

            String textRow = scanner.nextLine();
            String[] currentRowElements = textRow.split(" ");

            String firstElement = currentRowElements[0];
            String secondElement = currentRowElements[1];

            if (row % 2 != 0) {
                // първият елемент -> първият масив
                // вторият елемент -> вторият масив
                firstArray[position] = firstElement;
                secondArray[position] = secondElement;
            } else {
                // първият елемент -> вторият масив
                // вторият елемент -> първият масив
                firstArray[position] = secondElement;
                secondArray[position] = firstElement;
            }

            position++;
        }

        for (String el : firstArray) {
            System.out.print(el + " ");
        }
        System.out.println();
        for (String el : secondArray) {
            System.out.print(el + " ");
        }
    }
}
