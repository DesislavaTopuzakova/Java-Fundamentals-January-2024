package students;

public class Student {
    //характеристики: first name, last name, age and hometown
    //fields
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    //конструктор -> създаваме обекти от класа
    public Student(String firstName, String lastName, int age, String hometown) {
        //нов празен обект
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    //методи -> действията, които ще може да прави всеки един студент
    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }
}
