package stundents2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] studentsDataArr = input.split(" ");
            String firstName = studentsDataArr[0];
            String lastName = studentsDataArr[1];
            int age = Integer.parseInt(studentsDataArr[2]);
            String town = studentsDataArr[3];

            if (isStudentExisting(studentsList, firstName, lastName)) {
                int index = getExistingIndex(studentsList, firstName, lastName);
                studentsList.get(index).setAge(age);
                studentsList.get(index).setHometown(town);
            } else {
                Student currentStudent = new Student(firstName, lastName, age, town);
                studentsList.add(currentStudent);
            }

            input = scanner.nextLine();
        }

        String homeTown = scanner.nextLine();
        for (Student student : studentsList) {
            if (homeTown.equals(student.getHometown())) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    public static int getExistingIndex (List<Student> studentsList, String firstName, String lastName) {
        int index = -1;
        for (int i = 0; i < studentsList.size(); i++) {
            Student student = studentsList.get(i);
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                index = i;
            }
        }
        return index;
    }

    static boolean isStudentExisting(List<Student> studentsList, String firstName, String lastName) {
        for (Student student : studentsList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
