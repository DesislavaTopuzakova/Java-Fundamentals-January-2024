import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String[] data = scanner.nextLine().split("\\s+");
        String bombNumber = data[0];
        int power = Integer.parseInt(data[1]);

        while (elements.contains(bombNumber)) {
            int elementIndex = elements.indexOf(bombNumber);

            int start = elementIndex - power;
            if (start < 0) {
                start = 0;
            }

            int end = elementIndex + power;
            if (end > elements.size() - 1) {
                end = elements.size() - 1;
            }

            for (int i = end; i >= start; i--) {
                elements.remove(i);
            }
        }

        System.out.println(elements.stream().mapToInt(Integer::parseInt).sum());
    }
}
