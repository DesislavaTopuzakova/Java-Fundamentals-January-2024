package maps;

import java.util.*;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                                    .mapToDouble(Double::parseDouble).toArray();
        //numbers = [8, 2, 2, 8, 2]

        //запис / двойка (pair): число -> бр. срещанията
        Map<Double, Integer> numbersCountMap = new TreeMap<>();

        for (double number : numbers) {
            //1. не сме го срещали до момента -> нямаме го записано
            if (!numbersCountMap.containsKey(number)) {
                //първото срещане на числото
                numbersCountMap.put(number, 1);
            }
            //2. вече да сме го срещали -> има го записано
            else {
                int currentCount = numbersCountMap.get(number);//текущия брой на срещанията
                numbersCountMap.put(number, currentCount + 1);
            }
        }

        //принтиране на записите в map
        //numbersCountMap:
        //2 -> 3
        //8 -> 2
        //запис: key(число) -> value(бр. срещанията)

        for (Map.Entry<Double, Integer> pair : numbersCountMap.entrySet()) {
            //всеки един запис е съхранен в pair
            //pair: key (число)   value (бр. срещания)
            System.out.printf("%.0f -> %d%n", pair.getKey(), pair.getValue());
        }



    }
}
