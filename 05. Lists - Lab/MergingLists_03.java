package Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();
        int minSize = Math.min(firstList.size(), secondList.size());
        for (int i = 0; i < minSize; i++) {
            int numFirstList = firstList.get(i);
            int numSecondList = secondList.get(i);

            resultList.add(numFirstList);
            resultList.add(numSecondList);
        }

        if (firstList.size() > secondList.size()) {
            List<Integer> subList = firstList.subList(minSize, firstList.size());

            resultList.addAll(subList);
        } else if (secondList.size() > firstList.size()) {
            List<Integer> subList = secondList.subList(minSize, secondList.size());

            resultList.addAll(subList);
        }

        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
}
