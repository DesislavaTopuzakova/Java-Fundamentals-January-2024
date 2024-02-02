import java.util.Scanner;

public class PasswordValidator_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        //1. Проверяваме дали дължината на паролата е между 6 и 10 символа
        boolean isLengthValid = isLengthValid(password);
        if (!isLengthValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        //2. Проверяваме дали съдържа само цифри и букви
        boolean isContentValid = isContentValid(password);
        if (!isContentValid) {
            System.out.println("Password must consist only of letters and digits");
        }

        //3. Проверяваме дали има поне 2 цифри
        boolean isAtLeastTwoDigits = isAtLeastTwoDigits(password);
        if (!isAtLeastTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }

        // Ако и трите условия са спазени ще кажем, че паролата е валидна:
        if (isLengthValid && isContentValid && isAtLeastTwoDigits) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isAtLeastTwoDigits(String input) {

        int digitsCount = 0;
        for (char symbol : input.toCharArray()) {
            if (Character.isDigit(symbol)) {
                digitsCount++;
            }
        }
        return digitsCount >= 2;
    }


    public static boolean isLengthValid(String input) {
        return input.length() >= 6 && input.length() <= 10;
    }

    public static boolean isContentValid(String input) {
        for (char symbol : input.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }


}
