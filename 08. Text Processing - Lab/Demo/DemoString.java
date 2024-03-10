package textProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoString {
    public static void main(String[] args) {
        //Immutable - String, double, int
        String word = "table";
        word = word.replace("ta", "er");

        int number = 5;
        number = number + 6;

        //Mutable - map, list, array
        List<Integer> list = new ArrayList<>();
        list.add(4);

        Scanner scanner = new Scanner(System.in);
        String name = "Desislava";
        String lastName = scanner.nextLine();

        //дължина на текста = брой символите
        int length = name.length();
        System.out.println(length);

        //достъп на елементите
        System.out.println(name.charAt(0)); //първия символ в текст
        System.out.println(name.charAt(name.length() - 1)); //последния символ в текст

        char [] symbols = name.toCharArray();
        //"Desi" -> ['D', 'e', 's', 'i']
        for (char symbol : symbols) {
            System.out.println(symbol);
        }

        //обходим един текст от първия към последния символ
        for (int position = 0; position <= name.length() - 1; position++) {
            char currentSymbol = name.charAt(position);
            System.out.println(currentSymbol);
        }

        //обходим един текст от последния към първия символ
        for (int position = name.length() - 1; position >= 0; position--) {
            char currentSymbol = name.charAt(position);
            System.out.println(currentSymbol);
        }

        //сравняване на текстове
        //!!! == -> сравняваме адреси в паметта
        //!!! equals -> сравняваме стойности

        //equals -> сравнява два текста и прави разлика между малки и главни букви
        System.out.println("deSI".equals("Desi")); //false
        System.out.println("Table".equals("Table")); //true
        //equalsIgnoreCase -> сравнява два текста без да прави разлика между малки и главни букви
        System.out.println("dESI".equalsIgnoreCase("Desi")); //true
        System.out.println("turtle".equalsIgnoreCase("turtle")); //true


        //конкатенация -> долепяне / събиране на два текста
        //1. чрез оператора +
        String result = "Desi" + " " + "Topuzakova";
        //2. чрез метода concat
        String concatResult = "Ivan".concat(" ").concat("Ivanov");


        //Join
        String text = String.join(",", "con", "ca", "ten", "ate");
        String[] textsArray = new String[] {"Ivan", "Georgi", "Peter"};
        System.out.println(String.join("-", textsArray));

        //Split
        String input = "Ivan-Peter-John-George";
        String [] words = input.split("-");

        //Substring
        String partInput = input.substring(0, 4); //position: [0;4)
        String partInput2 = input.substring(8);//position: [8; length - 1]


        //Searching -> indexOf, lastIndexOf, contains
        String fruits = "banana, apple, kiwi, banana, apple";
        System.out.println(fruits.indexOf("banana"));
        System.out.println(fruits.lastIndexOf("apple"));
        System.out.println(fruits.contains("kiwi")); //true
        System.out.println(fruits.contains("pineapple")); //false

        //повтаряне на текст
        String animal = "turtle";
        System.out.println(animal.repeat(5));

        //замяна
        //замяна на всички срещания -> replace
        //замяна на първото срещане -> replaceFirst
        String lastNamePeople = "Ivanov Ivanov Petrov Georgiev";
        lastNamePeople = lastNamePeople.replace("Ivanov", "Petkov");


        String animalNames = "Jessy Sarah Rockie Sarah";
        animalNames = animalNames.replaceFirst("Sarah", "Ivan");


        System.out.println("desi".toUpperCase());//"DESI"
        System.out.println("DESI".toLowerCase());//"desi"

        System.out.println("I am hero".endsWith("ro")); //true
        System.out.println("I am hero".endsWith("mo")); //false
        System.out.println("My name is Desi!".startsWith("My")); //true
        System.out.println("My name is Desi!".startsWith("Test")); //false

        System.out.println(animalNames.isEmpty()); //false
        System.out.println("".isEmpty()); //true
        //isEmpty => true -> length == 0
        //isEmpty => false -> length > 0


        //премахване на излишни интервали в началото / края на текста
        String exampleTrim = "      Desi    ";
        System.out.println(exampleTrim.trim()); //"Desi"

    }
}
