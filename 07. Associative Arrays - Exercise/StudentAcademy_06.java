import java.util.*;

public class StudentAcademy_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int i = 0; i < countStudents; i++) {

            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (studentGrades.containsKey(studentName)) {
                studentGrades.get(studentName).add(grade);
            } else {
                studentGrades.put(studentName, new ArrayList<>());
                studentGrades.get(studentName).add(grade);
            }
        }

        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {

            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();

            // Option 1
            double sum = grades.stream().mapToDouble(Double::doubleValue).sum();

            // Option 2
//            double sum = 0;
//            for (Double grade : grades) {
//                sum  += grade;
//            }
            double averageGrade = sum / grades.size();
            if (averageGrade >= 4.50){
                System.out.printf("%s -> %.2f\n", studentName, averageGrade);
            }
        }

    }
}
