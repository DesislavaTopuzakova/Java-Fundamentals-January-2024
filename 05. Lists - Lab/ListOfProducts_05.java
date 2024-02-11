package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countProducts = Integer.parseInt(scanner.nextLine()); //брой продуктите
        List<String> products = new ArrayList<>(); //списък с продуктите

        for (int count = 1; count <= countProducts; count++) {
            String productName = scanner.nextLine();
            products.add(productName);
        }

        //products = {"Potatoes", "Tomatoes", "Onions", "Apples"}
        //sort -> сортира в ascending order (нарастващ ред)
        //списък с числа.sort -> нарастващ ред от най-малкото към най-голямото
        //списък с текстове.sort -> нарастващ ред от A към Z
        Collections.sort(products);
        //products = {"Apples", "Onions", "Potatoes", "Tomato"}

        int number = 1; //пореден номер на продукта
        for (String product : products) {
            System.out.println(number + "." + product);
            number++;
        }
    }
}
