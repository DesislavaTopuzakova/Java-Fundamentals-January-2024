package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();//{} -> size = 0
        //пре-дефиниран списък
        List<Integer> numbersStatic = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        //{10, 20, 30, 40, 50, 60} -> size = 6
        numbersStatic.add(99);
        //{10, 20, 30, 40, 50, 60, 99} -> size = 7


        //1. размер на списък
        System.out.println(numbers.size()); //размер на списъка

        //2. добавяне на елемент към списъка
        numbers.add(50); //добавя елемента в края на списъка -> {50}
        numbers.add(0, 23); //вмъкваме елемент на дадена позиция; изместваме останалите
        numbers.set(1, 45); //заменя елемента на дадена позиция с дадения елемент

        //3. премахване на елемент от списъка
        numbers.remove(Integer.valueOf(50)); //премахва първото срещане дадения елемент от списъка
        numbers.remove(1); //премахва елемента на дадената позиция
        
        //4. отпечатваме списък
        //4.1. for цикъл  -> трябва да работим с позициите
        for (int position = 0; position <= numbers.size() - 1; position++) {
            System.out.println(numbers.get(position));
        }

        //4.2. foreach -> трябва да работим само с елементите
        for (int number : numbers) {
            System.out.println(number);
        }

        //4.3. toString
        //numbers = {3, 5, 6, 12,34, 56};
        System.out.println(numbers.toString());
        //[3, 5, 6, 12, 34, 56]

        //4.4 String.join -> само за лист от текстове
        List<String> names = new ArrayList<>(Arrays.asList("Ivan", "Georgi", "Pesho"));
        System.out.println(String.join(", ", names));

        //5. Други методи на list
        System.out.println(numbers.contains(12)); //проверява дали даден елемент е в листа
        System.out.println(numbers.isEmpty()); //проверява дали листът е празен
        numbers.clear(); //премахва всички елементи в листа
        System.out.println(numbers.indexOf(56)); //Позицията, на която се намира елемента; -1 ако няма такъв елемент

        //6. Четене на лист от конзолата
        //34 56 12 45 87
        Scanner scanner = new Scanner(System.in);
        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                                            .mapToInt(Integer::parseInt).toArray();

        //"34 56 12 45 87".split(" ") -> ["34", "56", "12", "45", "87"] -> [34, 56, 12, 45, 87] -> {34, 56, 12, 45, 87}
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                                            .map(Integer::parseInt).collect(Collectors.toList());

        //"Desi Ivan Georgi Pesho".split(" ") -> ["Desi", "Ivan", "Georgi", "Pesho"] -> {"Desi", "Ivan", "Georgi", "Pesho"}
        List<String> namesList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        //7. Сортиране
        //7.1. ascending order -> нарастващ ред
        Collections.sort(numbers);
        //7.1. descending order -> намаляващ ред
        Collections.sort(numbers); //ascending order
        Collections.reverse(numbers); //обратен ред

    }
}
