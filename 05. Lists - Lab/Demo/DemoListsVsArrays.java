package Lists;

import java.util.ArrayList;
import java.util.List;

public class DemoListsVsArrays {
    public static void main(String[] args) {
        //1. съзадаването
        int [] array = new int[10]; //задаваме брой на елементите
        List<Integer> list = new ArrayList<>(); //няма нужда да задаваме брой елементи

        //2. брой елементи
        System.out.println(array.length); //дължина = брой елементи
        System.out.println(list.size()); //размер = брой елементи

        //3. достъп елементи
        System.out.println(array[0]);
        System.out.println(list.get(0));

        //4. добавяме елементи
        array[1] = 5;
        list.add(50); //добавяме елемента в скобите в края на списъка
        list.add(0, 12); //вмъквате елемента на дадения индекс

        //5. обхождане с foreach
        for (int number: array) {
            System.out.println(number);
        }

        for (int number: list) {
            System.out.println(number);
        }

        //5. обхождане с for
        for (int position = 0; position <= array.length - 1; position++) {
            System.out.println(array[position]);
        }

        for (int position = 0; position <= list.size() - 1; position++) {
            System.out.println(list.get(position));
        }

        //ПРЕДИМСТВА НА ЛИСТ ПРЕД МАСИВ
        //1. ПРЕОРАЗМЕРЯВАНЕ - НЯМА  НУЖДА ПРЕДВАРИТЕЛНО ДА ЗНАЕМ БРОЯ НА ЕЛЕМЕНТИ
        //2. ПО-ФУНКЦИОНАЛЕН = ПО-ЛЕСНО СЕ МОДИФИЦИРА

    }
}
