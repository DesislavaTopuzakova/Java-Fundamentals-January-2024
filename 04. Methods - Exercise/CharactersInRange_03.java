import java.util.Scanner;

public class CharactersInRange_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0); // "a" -> 'a'
        char secondSymbol = scanner.nextLine().charAt(0);

        printSymbolsInRange(firstSymbol, secondSymbol);
    }

    public static void printSymbolsInRange(char firstSymbol, char secondSymbol) {

        // по-малкият до по-големият
        if (firstSymbol < secondSymbol) {
            for (int asciiValue = firstSymbol + 1; asciiValue < secondSymbol; asciiValue++) {
                System.out.print((char) asciiValue + " ");
            }
        } else {
            for (int asciiValue = secondSymbol + 1; asciiValue < firstSymbol; asciiValue++) {
                System.out.print((char) asciiValue + " ");
            }
        }
    }
}
