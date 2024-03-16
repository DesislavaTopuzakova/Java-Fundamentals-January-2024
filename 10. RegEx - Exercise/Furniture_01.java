package RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)"; //текст на шаблона
        Pattern pattern = Pattern.compile(regex); //шаблон

        List<String> furniture = new ArrayList<>(); //списък със закупените мебели
        double totalPrice = 0; //общо изхарчена сума за закупените мебели

        String input = scanner.nextLine(); //входни данни
        while (!input.equals("Purchase")) {
            //input = ">>Sofa<<312.23!3"
            //проверка дали входните данни отговарят на шаблона
            Matcher matcher = pattern.matcher(input);
            //matcher -> съвкупност от текстовете, които отговарят на шаблон
            //matcher = [">>(?<furnitureName>Sofa)<<(?<price>312.23)!(?<quantity>3)"]
            //find
            //true -> input отговарят на шаблона
            //false -> input не отговарят на шаблона
            if (matcher.find()) {
                //input отговаря на шаблона -> валидни входни данни -> информация за закупена мебел
                //matcher.find() = ">>(?<furnitureName>Sofa)<<(?<price>312.23)!(?<quantity>3)"
                String furnitureName = matcher.group("furnitureName");//мебел -> "Sofa"
                double price = Double.parseDouble(matcher.group("price"));//ед. цена -> "312.23" -> 312.23
                int quantity =  Integer.parseInt(matcher.group("quantity"));//количество -> "3" -> 3

                furniture.add(furnitureName);
                double pricePerFurniture = price * quantity; //сума за текуща мебел
                totalPrice += pricePerFurniture;
            }
            input = scanner.nextLine();
        }

        //списък със закупени мебели
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);

        //обща сума за мебели
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
