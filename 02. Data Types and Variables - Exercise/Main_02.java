public class Main_02 {

    public static void main(String[] args) {

        char symbol = 'A';

        int asciiValue1 = (int) symbol; // explicit casting
        int asciiValue2 = symbol; // implicit casting

        System.out.println(asciiValue1);
        System.out.println(asciiValue2);
    }

}
