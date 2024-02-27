package students_04;

public class Student {

    // 1. Fields
    private String firstName;
    private String lastName;
    private double grade;

    // 2. Constructor
    public Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    // 3. Methods
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getGrade() {
        return this.grade;
    }
}
