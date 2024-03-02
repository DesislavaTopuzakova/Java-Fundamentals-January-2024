import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> characterCounts = new LinkedHashMap<>();

        String input = scanner.nextLine();

        for (char symbol : input.toCharArray()) {

            if (symbol == ' ') {
                continue;
            }

            if (characterCounts.containsKey(symbol)) {
                int count = characterCounts.get(symbol);
                characterCounts.put(symbol, count + 1);
            } else {
                characterCounts.put(symbol, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}