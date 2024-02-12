package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt).collect(Collectors.toList()); //всички числа

        //numbers = {10, -5, 7, 9, -33, 50}
        
        List<Integer> positiveNumbers = new ArrayList<>(); //положителните числа

        for (int number : numbers) { //всяко едно число от първоначалния списък
            if (number > 0) {
                //положително число
                positiveNumbers.add(number);
            }
        }
        //positiveNumbers -> имаме само положителните числа от първоначалния списък
        //positiveNumbers = {10, 7, 9, 50}
        //reverse (обръщаме на обратно)
        Collections.reverse(positiveNumbers);
        //positiveNumbers = {50, 9, 7, 10}

        //празен списък
        if (positiveNumbers.isEmpty()) {
            //празен списък
            System.out.println("empty");
        } else {
            //има елементи в списъка
            /*System.out.println(positiveNumbers.toString()           //"[50, 10, 9, 7]"
                                .replace("[", "")   //"50, 10, 9, 7]"
                                .replace("]", "")   //"50, 10, 9, 7"
                                .replaceAll(",", "") //"50 10 9 7"
            );*/

            for (int number : positiveNumbers) {
                System.out.print(number + " ");
            }
        }
    }
}
