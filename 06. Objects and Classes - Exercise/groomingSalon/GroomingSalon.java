package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {

    // 1. Fields
    private List<Pet> data;
    private int capacity;

    // 2. Constructor
    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    // 3. Methods
    public void add(Pet pet) {
        if (this.data.size() < capacity) {
            this.data.add(pet);
        }
    }

    public boolean remove(String name) {
        for (Pet pet : this.data) {
            if (pet.getName().equals(name)) {
                this.data.remove(pet);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner) {
        for (Pet pet : this.data) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
                return pet;
            }
        }
        return null;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        String statistics = "The grooming salon has the following clients:\n";
        for (Pet pet : this.data) {
            statistics += String.format("%s %s\n", pet.getName(), pet.getOwner());
        }
        return statistics;
    }
}
