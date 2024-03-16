package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexPassword = "_\\.+(?<passwordText>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
        Pattern pattern = Pattern.compile(regexPassword);

        int n = Integer.parseInt(scanner.nextLine()); //брой пароли
        for (int count = 1; count <= n; count++) {
            String password = scanner.nextLine();
            //1. проверка дали е валидна паролата
            Matcher matcher = pattern.matcher(password);
            //1. matcher = [] -> невалидна парола
            //2. matcher = ["_.A123f23A_."] -> валидна парола

            if (matcher.find()) {
                //matcher.find() -> "_.A123f23A_."
                //имаме валидна парола -> категоризирам
                String textPassword = matcher.group("passwordText"); //"A123f23A"
                //2. категоризация
                StringBuilder sbDigits = new StringBuilder(); //долепям намерените цифри в паролата
                for (char symbol : textPassword.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        //цифра
                        sbDigits.append(symbol);
                    }
                }
                //sbDigits -> долепени всички цифри в паролата
                //1. нямаме цифри в паролата -> група default
                if (sbDigits.length() == 0) {
                    System.out.println("Group: default");
                }
                //2. имаме цифри в паролата
                else {
                    System.out.println("Group: " + sbDigits);
                }
            } else {
                //matcher = [] -> невалидна парола
                System.out.println("Invalid pass!");
            }

        }
    }
}
