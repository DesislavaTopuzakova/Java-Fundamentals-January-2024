import java.util.Scanner;

public class PokeMon_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());
        int startPower = power;

        int countPokes = 0;

        while (power >= distance) {

            // 1. Отива до целта (power -= distance)
            power -= distance;
            // 2. Отброяваме успешно намушкване
            countPokes++;
            // 3. Проверяваме дали сме стигнали фактор на умора
            if (power == startPower / 2) {
                if (factor != 0) {
                    power /= factor;
                }
            }
        }

        System.out.println(power);
        System.out.println(countPokes);
    }
}
