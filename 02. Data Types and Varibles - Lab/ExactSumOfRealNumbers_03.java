package DataTypes;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal("0");
        for (int number = 1; number <= count; number++) { //всички числа от първото до последното
            BigDecimal value = new BigDecimal(scanner.nextLine()); //стойността на въведеното число

            sum = sum.add(value);
        }

        System.out.println(sum);
    }
}
