package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //фирма
        //име на човек(String) -> заплата(double)
        Map<String, Double> salariesMap = new HashMap<>();

        //HashMap -> няма специфична подредба на елементите
        salariesMap.put("Plamen", 564.54); //добавя при всички случаи
        salariesMap.putIfAbsent("Ivan", 3450.50); //добавя ако такъв ключ няма

        //nested maps -> in Java Advanced
        Map<String, Map<Integer, String>> nestedMap = new HashMap<>();


        //salariesMap
        //Plamen -> 564.54
        //Ivan -> 3450.50

        salariesMap.replace("Plamen", 4500.00);
        //salariesMap
        //Plamen -> 4500.00
        //Ivan -> 3450.50

        salariesMap.replace("Ivan", 3450.50, 2300.00);



    }
}
