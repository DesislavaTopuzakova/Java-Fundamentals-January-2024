package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>(); //списък с въведени студенти

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            //input = "John Smith 15 Sofia"
            String[] data = input.split(" ");
            //input.split(" ") -> ["John", "Smith", "15", "Sofia"]
            String firstName = data[0]; //първото име
            String lastName = data[1]; //фамилното име
            int age = Integer.parseInt(data[2]);
            String hometown = data[3];

            //СТУДЕНТ
            Student student = new Student(firstName, lastName, age, hometown);

            //добавяме в списъка с всички студенти
            studentList.add(student);

            input = scanner.nextLine();
        }

        //ПЪЛЕН СПИСЪК ОТ ВЪВЕДЕНИ СТУДЕНТИ -> studentList
        String enteredTown = scanner.nextLine();

        for (Student student : studentList) {
            if (student.getHometown().equals(enteredTown)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }
}
