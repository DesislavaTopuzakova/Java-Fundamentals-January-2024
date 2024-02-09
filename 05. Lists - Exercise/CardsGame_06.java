import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (!firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {

            int firstPlayerCard = firstPlayerCards.get(0);
            int secondPlayerCard = secondPlayerCards.get(0);

            firstPlayerCards.remove(0);
            secondPlayerCards.remove(0);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerCards.add(firstPlayerCard);
                firstPlayerCards.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayerCards.add(secondPlayerCard);
                secondPlayerCards.add(firstPlayerCard);
            }
        }

        if (!firstPlayerCards.isEmpty()) {
            int sum = firstPlayerCards.stream().mapToInt(Integer::intValue).sum();
            System.out.println("First player wins! Sum: " + sum);
        } else {
            int sum = secondPlayerCards.stream().mapToInt(Integer::intValue).sum();
            System.out.println("Second player wins! Sum: " + sum);
        }
    }
}
