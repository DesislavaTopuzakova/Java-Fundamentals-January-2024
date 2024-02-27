package opinion_poll_03;

public class Person {

    // 1. Fields
    private String name;
    private int age;

    // 2. Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3. Methods
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
