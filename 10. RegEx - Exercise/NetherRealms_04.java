package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] demonNames = scanner.nextLine().replace(" ", "").split(",");

        for (String demonName : demonNames) {
            int health = getHealth(demonName);
            double damage = getDamage(demonName);

            //модификации на damage
            for (char symbol : demonName.toCharArray()) {
                if (symbol == '*') {
                    damage *= 2;
                } else if (symbol == '/') {
                    damage /= 2;
                }
            }

            //отпечатваме за всеки демон
            System.out.printf("%s - %d health, %.2f damage%n", demonName, health, damage);
        }
    }

    //изчислява и връща damage
    private static double getDamage(String demonName) {
        double damage = 0;
        //всички дробни и цели числа, които са положителни и отрицателни
        String regexNumbers = "[-]?[0-9]+\\.?[0-9]*";
        Pattern pattern = Pattern.compile(regexNumbers);
        Matcher matcher = pattern.matcher(demonName);
        //matcher -> съвкупност от всички тесктове, които ми отговарят на шаблона
        //demonName = "M3ph-0.5s-0.5t0.0**"
        //matcher = ["3", "-0.5", "-0.5", "0.0"]
        while (matcher.find()) {
            damage += Double.parseDouble(matcher.group());
        }
        return damage;
    }

    //изчислява и връща health
    private static int getHealth(String demonName) {
        int health = 0;
        //всички символи без: [0-9], +, -, ., *, /
        for (char symbol : demonName.toCharArray()) {
            if (!Character.isDigit(symbol) && symbol != '+' && symbol != '-' && symbol != '*' && symbol != '.' && symbol != '/') {
                health += (int)(symbol);
            }
        }
        return health;
    }
}
