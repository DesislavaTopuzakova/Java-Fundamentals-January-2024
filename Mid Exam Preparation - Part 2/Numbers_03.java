package ExamPrepartion;

import java.util.*;
import java.util.stream.Collectors;

public class Third_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        //{10, 20, 30, 40, 50}

        //1. Средноаритметична стойност
        int sum = 0; //сума на елементите в списък
        for (int number : numbers) {
            sum += number;
        }
        double average = sum * 1.0 / numbers.size(); //средна стойност в списъка

        //2. Всички числа по-големи от average
        List<Integer> greaterElements = new ArrayList<>(); //числа, по-големи от average
        for (int number : numbers) {
            if (number > average) {
                greaterElements.add(number);
            }
        }
        //greaterElements -> всички числа, по-големи от average

        //3. Сортираме по-големите елементи от average в descending order
        //greaterElements = {40, 50}
        Collections.sort(greaterElements); //ascending order (нарастващ ред)
        Collections.reverse(greaterElements); //descending order (намаляващ ред)
        //greaterElements = {50, 40}

        //4. Отпечатваме
        //нямаме числа, които да отговарят на условието -> greaterElements = {}; size = 0
        if (greaterElements.isEmpty()) {
            System.out.println("No");
        } else {
            //имаме числа, които да отговарят на условието -> greaterElements.size > 0
            //1. брой числа <= 5 -> greaterElements = {40, 50}
            if (greaterElements.size() <= 5) {
                //отпечатваме всички налични числа
                for (int number : greaterElements) {
                    System.out.print(number + " ");
                }
            }
            else {
                //2. брой числа > 5 -> greaterElements = {50, 40, 30 , 24, 12, 6}
                //първите 5 числа
                for (int position = 0; position <= 4; position++) {
                    System.out.print(greaterElements.get(position) + " ");
                }
            }
        }
    }
}
