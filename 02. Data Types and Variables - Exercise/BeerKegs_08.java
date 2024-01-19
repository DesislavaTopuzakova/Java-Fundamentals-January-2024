import java.util.Scanner;

public class BeerKegs_08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kegsCount = Integer.parseInt(scanner.nextLine());

        // 1. Обходим всички кегове
        //  - Изчисляваме обема на кега
        //  - Проверяваме дали сме намерили по-голям кег от досегашният най-голям

        String maxModel = "";
        double maxVolume = 0;

        for (int keg = 1; keg <= kegsCount; keg++) {

            // Информация за текущият кег:
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            //Формула: π * r^2 * h
            double volume = Math.PI * radius * radius * height;
            //double volume2 = Math.PI * Math.pow(radius, 2) * height;

            // Проверяваме дали сме намерили по-голям кег
            if (volume > maxVolume) {
                maxModel = model;
                maxVolume = volume;
            }
        }

        // 2. Принтираме модела на най-големият кег
        System.out.println(maxModel);
    }
}
