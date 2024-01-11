package BasicsOverview;

import java.util.Scanner;

public class DivisibleBy3_08 {
    public static void main(String[] args) {
        //[1; 100] които се делят на 3
        //for цикъл
        //1. начало -> 1
        //2. край -> 100
        //3. какво повтарям -> проверка дали се дели на 3 -> принтирам
        //4. промяна -> +1

        for (int number = 1; number <= 100; number++) {
            if (number % 3 == 0) {
                //number се дели на 3
                System.out.println(number);
            }
        }

    }
}
