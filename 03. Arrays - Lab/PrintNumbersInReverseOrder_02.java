package Arrays;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. съхраняваме числата в масив
        int count = Integer.parseInt(scanner.nextLine()); //брой на числата, с които ще работим
        int [] numbers = new int[count];

        for (int position = 0; position <= numbers.length - 1; position++) {
            numbers[position] = Integer.parseInt(scanner.nextLine());
        }

        //2. отпечтваме в обратен ред
        //[10, 20, 30]
        //обратен ред: последната позиция към първата
        for (int position = numbers.length - 1; position >= 0; position--) {
            System.out.print(numbers[position] + " ");
        }
    }
}
