package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //scanner.nextLine() -> "1 2 3 4 5 6"
        //scanner.nextLine().split(" ") -> ["1", "2","3", "4", "5", "6"]
        //Arrays.stream(scanner.nextLine().split(" ")) -> дава възможност да модифицирам лесно елементите на масив
        //mapToInt(Integer::parseInt) -> извършва действието в скобите върху всички елементи ->  //[1, 2, 3, 4, 5, 6]
        int [] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        //numbers = [1, 2, 3, 4, 5, 6]
        int sumEven = 0; //сума на четните елементи в масива
        //обхождаме с foreach
        for (int number : numbers) {
            //действие, което повтаряме за всеки елемент
            if (number % 2 == 0) {
                sumEven += number;
            }
        }

        //обходили всички елементи
        System.out.println(sumEven);

    }
}
