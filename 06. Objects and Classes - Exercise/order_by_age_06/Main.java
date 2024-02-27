package order_by_age_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {

            //"George 123456 20"
            String name = input.split(" ")[0];
            String id = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);

            Person person = new Person(name, id, age);
            people.add(person);

            input = scanner.nextLine();
        }

        people.sort(Comparator.comparing(Person::getAge));

        for (Person person : people) {
            System.out.printf("%s with ID: %s is %d years old.\n", person.getName(), person.getId(), person.getAge());
        }
    }
}
