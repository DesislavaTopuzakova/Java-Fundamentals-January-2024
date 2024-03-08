package textProcessing;

import java.util.Scanner;

public class DemoStringVsStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //STRING VS STRING BUILDER
        //1. STRING BUILDER има повече вградени методи от STRING -> insert, delete, reverse
        //2. STRING BUILDER e по-бърз от STRING

        //бързина на долепяне в String
        String textExample = "";
        for (int i = 0; i < 1000000; i++) {
            textExample += "a";
            //textExample = textExample + "a";
        }

        System.out.println(textExample);

        //бързина на долепяне в StringBuilder
        StringBuilder sb = new StringBuilder(); //""
        for (int i = 0; i < 1000000; i++) {
            sb.append("a");
        }

        System.out.println(sb);
    }
}
