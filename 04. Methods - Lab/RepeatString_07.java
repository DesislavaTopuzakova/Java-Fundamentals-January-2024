package Methods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        String textToRepeat = scanner.nextLine();
        int countRepeat = Integer.parseInt(scanner.nextLine());
        //2. контсруираме текста
        String finalText = buildText(textToRepeat, countRepeat);
        //3. отпечатваме текста
        System.out.println(finalText);
    }


    //метод, който образува текста и го връща
    public static String buildText (String textToRepeat, int countRepeat) {
        String builtText = ""; //изгрдения текст

        for (int count = 1; count <= countRepeat; count++) {
            builtText += textToRepeat;
            //builtText = builtText + textToRepeat;
        }

        //готовия текст с повторенията
        return builtText;
    }

}
