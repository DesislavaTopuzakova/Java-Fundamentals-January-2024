package vehicle_catalogue_05;

public class Vehicle {

    // 1. Fields
    private String type;
    private String model;
    private String color;
    private int horsePower;

    // 2.  Constructor
    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    // 3. Methods
    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {

        String vehicleType = type.equals("car") ? "Car" : "Truck";
        return "Type: " + vehicleType + "\n" +
                "Model: " + model + "\n" +
                "Color: " + color + "\n" +
                "Horsepower: " + horsePower;
    }
}
