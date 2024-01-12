public class Main {

    public static void main(String[] args) {


        String number = "145";

        char symbol = number.charAt(0);

        String symbolAsText = symbol + "";

        int digit = Integer.parseInt(symbolAsText);

        System.out.println(digit);
    }
}
