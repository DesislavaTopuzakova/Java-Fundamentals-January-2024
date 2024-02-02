package Methods;

import java.util.Scanner;

public class CalculateArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int area = calculateArea(length, width);
        System.out.println(area);
    }

    //метод, който изчислява и връща лицето на правоъгълник
    public static int calculateArea(int length, int width) {
        int area = length * width;
        return area;
    }
}
