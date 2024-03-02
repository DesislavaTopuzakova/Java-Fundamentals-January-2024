import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> productsQuantity = new LinkedHashMap<>();
        Map<String, Double> productsPrice = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {

            //Beer 2.20 100
            String productName = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            if (productsQuantity.containsKey(productName)) {
                int existingQuantity = productsQuantity.get(productName);
                productsQuantity.put(productName, existingQuantity + quantity);
            } else {
                productsQuantity.put(productName, quantity);
            }

            productsPrice.put(productName, price);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : productsQuantity.entrySet()) {

            String productName = entry.getKey();
            int productQuantity = entry.getValue();
            double productPrice = productsPrice.get(productName);

            System.out.printf("%s -> %.2f\n", productName, productQuantity * productPrice);
        }
    }
}
