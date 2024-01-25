import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //съвкупност от цели числа: 4, 6, 9, 12, 34, 23, 77, 12, 98, 14
        //целочислен масив с 10 елемента
        int[] array = {4, 6, 9, 12, 34, 23, 77, 12, 98, 14};
        //[4, 6, 9, 12, 34, 23, 77, 12, 98, 14] -> 10

        //дължина -> бр. елементите, които мога да съхраня в масив
        System.out.println(array.length);

        //достъп до елемент в масива
        System.out.println(array[2]);

        //достъпим първия елемент в масив
        System.out.println(array[0]);

        //достъпим последния елемент в масив
        System.out.println(array[array.length - 1]);

        String name = "Desi";
        System.out.println(name.length());
        //"Desi".toCharArray() -> ['D', 'e', 's', 'i']
        char[] letters = name.toCharArray(); //['D', 'e', 's', 'i']
        System.out.println(letters[0]);
        System.out.println(letters[letters.length - 1]);
        System.out.println(letters.length);

        //химикали- 2.40
        //моливи - 3.50
        //маркери - 5.60
        double[] prices = {2.40, 3.50, 5.60};

        //обхождане на масив
        String [] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};

        //начало: 0 позиция
        //край: последна позиция (daysOfWeek.length - 1)
        //повтаряме: принтираме елемента на текущата позиция
        //промяна: +1
        //while, for -> повтаряне на действия
        
        //използваме за обхождане for: има значение позицията на елемента
        //използваме за обхождане foreach: няма значение позицията на елемента


        for (int position = 0; position <= daysOfWeek.length - 1; position++) {
            System.out.println(daysOfWeek[position]);
        }

        //Foreach -> обхожда всеки елемент на масиви
        //["Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday", "Sunday"]
        for (String day : daysOfWeek) {
            //какво искаме да повторим за всеки един елемент
            System.out.println(day);
        }

        int[] numbers = {5, 6, 7, 7};
        for (int position = 0; position <= numbers.length - 1; position++) {
            numbers[position] = numbers[position] + 1;
        }
    }
}
