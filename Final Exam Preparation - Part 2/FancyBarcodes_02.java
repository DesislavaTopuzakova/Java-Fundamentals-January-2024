import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {

            //@#FreshFisH@#
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);

            if (matcher.find()) {

                StringBuilder productGroup = new StringBuilder();
                for (char symbol : barcode.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        productGroup.append(symbol);
                    }
                }

                // НЕ ИЗПОЛЗВАЙТЕ .isEmpty() -> compile-time error in Judge!
                if (productGroup.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + productGroup);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }

    }
}
