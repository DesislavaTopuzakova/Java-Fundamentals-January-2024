package demo;

import demo.Car;

public class Demo {
    public static void main(String[] args) {
        //автокъща

        Car.print(); //staticß
        Car car1 = new Car(230,"Skoda", "blue");
        car1.setHp(450);




    }
    public static void printCar (Car car) {
        System.out.println(car.getHp());
        System.out.println(car.getBrand());
    }
}