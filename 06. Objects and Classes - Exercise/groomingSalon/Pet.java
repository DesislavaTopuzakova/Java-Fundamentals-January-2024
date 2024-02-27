package groomingSalon;

public class Pet {

    // 1. Fields
    private String name;
    private int age;
    private String owner;

    // 2. Constructor
    public Pet(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    // 3. Methods
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String toString() {
        return String.format("%s %d - (%s)", this.name, this.age, this.owner);
    }
}
