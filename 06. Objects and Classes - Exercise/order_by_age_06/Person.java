package order_by_age_06;

public class Person {

    // 1. Fields
    private String name;
    private String id;
    private int age;

    // 2. Constructor
    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    // 3. Methods
    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }
}
