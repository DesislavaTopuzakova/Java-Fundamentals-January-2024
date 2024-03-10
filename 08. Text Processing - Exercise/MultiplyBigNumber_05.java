import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstNumber = scanner.nextLine();
        String secondNumber = scanner.nextLine();

        BigInteger number1 = new BigInteger(firstNumber);
        BigInteger number2 = new BigInteger(secondNumber);

        // Умножение
        System.out.println(number1.multiply(number2));

//        // Събиране
//        System.out.println(number1.add(number2));
//        // Изваждане
//        System.out.println(number1.subtract(number2));
//        // Деление
//        System.out.println(number1.divide(number2));
    }
}
