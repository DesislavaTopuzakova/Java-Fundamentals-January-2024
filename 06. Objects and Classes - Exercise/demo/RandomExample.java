package demo;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber = random.nextInt(10, 20);

        System.out.println(randomNumber);
    }
}
