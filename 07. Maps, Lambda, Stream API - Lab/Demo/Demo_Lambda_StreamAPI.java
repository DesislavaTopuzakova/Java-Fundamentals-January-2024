package maps;

import java.util.Arrays;
import java.util.Scanner;

public class Demo_Lambda_StreamAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(" "); // ["1", "3", "2", "8", "6"]
        int [] numbers = Arrays.stream(input)
                        .mapToInt(e -> Integer.parseInt(e))
                        .toArray();
        //API - Application Program Interface
        //Stream API - съвкупоност от методи върху структури данни

        //2 вида stream / поточна линия / поток
        //1. Primitive -> IntStream, DoubleStream -> sum, average, min, max
        //2. Stream -> Stream<String>, Stream<Integer>

        //Stream -> mapToInt, mapToDouble -> Primitive

        int min = Arrays.stream(numbers)
                    .min()
                    .orElse(23);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .filter(n -> n > 0)
                .toArray();


    }

    public static int convertToInt(String text) {
        return Integer.parseInt(text);
    }
}
