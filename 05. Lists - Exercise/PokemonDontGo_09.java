import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        while (numbers.size() > 0) {

            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= numbers.size() - 1) {
                int removedElement = numbers.get(index);
                sum += removedElement;
                numbers.remove(index);
                modifyList(numbers, removedElement);
            } else if (index < 0) {
                int removedElement = numbers.get(0);
                sum += removedElement;
                int lastElement = numbers.get(numbers.size() - 1);
                numbers.set(0, lastElement);
                modifyList(numbers, removedElement);
            } else if (index > numbers.size() - 1) {
                int removedElement = numbers.get(numbers.size() - 1);
                sum += removedElement;
                int firstElement = numbers.get(0);
                numbers.set(numbers.size() - 1, firstElement);
                modifyList(numbers, removedElement);
            }
        }

        System.out.println(sum);
    }

    private static void modifyList(List<Integer> numbers, int removedElement) {

        for (int position = 0; position <= numbers.size() - 1; position++) {

            int currentElement = numbers.get(position);

            if (currentElement <= removedElement) {
                currentElement += removedElement;
            } else {
                currentElement -= removedElement;
            }

            numbers.set(position, currentElement);
        }
    }

}
