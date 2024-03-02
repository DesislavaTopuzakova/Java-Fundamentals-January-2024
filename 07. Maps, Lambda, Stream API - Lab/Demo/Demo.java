package maps;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //запис: име на ученик (String) -> оценка (double)

        //съзадаване на празен map
        Map<String,Double> studentsMap = new TreeMap<>();

        //видове:
        //1. HashMap -> редът на записите не е гарантиран
        //2. LinkedHashMap -> редът на записите се запазва спрямо реда на добавяне
        //3. TreeMap -> нарежда записите спрямо ключа в нарастващ ред (ascending order)

        //добавяме записи в map
        studentsMap.put("Ivan", 5.60);
        studentsMap.put("Petya", 4.30);
        studentsMap.put("Georgi", 3.40);

        System.out.println(studentsMap.size()); //брой на записите в map-a

        //премахваме записи от map
        studentsMap.remove("Petya"); //премахване по ключ, ако го има
        studentsMap.remove("Georgi", 3.40); //премахване на запис, ако го има
        studentsMap.remove("Peter");

        //проверка дали map е празен (size = 0)
        System.out.println(studentsMap.isEmpty());

        //проверка дали съществува запис с даден ключ
        System.out.println(studentsMap.containsKey("Desi"));
        System.out.println(studentsMap.containsValue(5.60));

        //премахва всички елементи от map
        studentsMap.clear();

        //запис: име на ученика -> списък с оценки
        Map<String, List<Double>> studentGrades = new HashMap<>();

    }
}
