package maps;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = Arrays.stream(scanner.nextLine().split(" ")) //["kiwi", "orange", "banana", "apple"]
                         .filter(word -> word.length() % 2 == 0) //["kiwi", "orange", "banana"]
                          .toArray(String[] :: new);

        //1 начин -> StreamAPI
        //words = ["kiwi", "orange", "banana"]
        //Arrays.stream(words).forEach(word -> System.out.println(word));

        //2 начин -> foreach
        for (String word : words) {
            System.out.println(word);
        }

    }
}
