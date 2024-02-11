package Lists;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int iteration = numbers.size() / 2;
        for (int i = 0; i < iteration; i++) {
            numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
            numbers.remove(numbers.size() - 1);
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
