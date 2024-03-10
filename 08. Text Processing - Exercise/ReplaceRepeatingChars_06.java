import java.util.Scanner;

public class ReplaceRepeatingChars_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder textBulder = new StringBuilder(input);

        for (int position = 0; position < textBulder.length() - 1; position++) {
            if (textBulder.charAt(position) == textBulder.charAt(position + 1)) {
                textBulder.deleteCharAt(position + 1);
                position--;
            }
        }

        System.out.println(textBulder);
    }
}
