import java.util.Scanner;

public class MiddleCharacters_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacter(text);
    }

    public static void printMiddleCharacter(String text) {

        int length = text.length();

        if (length % 2 != 0) {
            //aString -> 'r' -> 3 index
            //length 7
            //Vik -> 'i' -> 1 index
            //length 3
            //Carts -> 'r' ->  2 index
            //length 5

            int indexOfMiddleChar = length / 2;
            System.out.println(text.charAt(indexOfMiddleChar));
        } else {
            //Desi -> 'e' -> 1 index ; 's' -> 2 index
            //length 4
            //Viktor -> 'k' -> 2 index ; 't' -> 3 index
            //length 6

            int indexOfFirstMiddleChar = length / 2 - 1;
            int indexOfSecondMiddleChar = length / 2;
            System.out.print(text.charAt(indexOfFirstMiddleChar));
            System.out.print(text.charAt(indexOfSecondMiddleChar));
        }

    }
}
