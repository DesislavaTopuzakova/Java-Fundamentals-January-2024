import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        Random random = new Random();

        for (int i = 0; i < wordsArr.length; i++) {
            int rndIndexX = random.nextInt(wordsArr.length);
            int rndIndexY = random.nextInt(wordsArr.length);

            String oldWord = wordsArr[rndIndexX];
            wordsArr[rndIndexX] = wordsArr[rndIndexY];
            wordsArr[rndIndexY] = oldWord;
        }

        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }
}
