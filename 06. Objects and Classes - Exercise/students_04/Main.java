package students_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            //"Lakia Eason 3.90"
            String input = scanner.nextLine();
            String firstName = input.split(" ")[0];
            String lastName = input.split(" ")[1];
            double grade = Double.parseDouble(input.split(" ")[2]);

            Student student = new Student(firstName, lastName, grade);
            students.add(student);
        }

        students.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : students) {
            System.out.printf("%s %s: %.2f\n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
