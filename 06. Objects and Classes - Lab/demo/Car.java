package demo;

public class Car {
    //характеристики - конски сили, марка, цвят - полета (fields)
    //private - достъпваме само в рамките на класа
    //public - достъпвам навсякъде в класовете в проекта
    public int hp;
    public String brand;
    public String color;

    //конструктори - public методи, чрез които създаваме обекти от класа
    //1. default constructor -> създава празен обект от класа
    //2. custom constructor -> създава обект, на който мога да задам стойности на полетата
    public Car (int hp, String brand, String color) {
        //празен обект
        //hp = 0
        //brand = null
        //color = null
        this.hp = hp;
        this.brand = brand;
        this.color = color;
    }

    //действия - drive, test drive, maintenance - методи

    //getters and setters - методи, които осигуряват достъп до полето
    public int getHp () {
        //връща стойността на полето hp
        return hp;
    }
    public void setHp (int hp) {
        //зададе стойност на полето hp
        this.hp = hp;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void print() {
        //методи, които са за класа
    }
 }
